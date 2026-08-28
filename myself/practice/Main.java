import java.io.*;

// Step 1: Create a class that implements Serializable
class Student implements Serializable {
    // Unique ID for serialization versioning
    private static final long serialVersionUID = 1L;

    String name;
    int age;
    
    // 'transient' fields are skipped during serialization
    transient String password;

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20, "mySecretPass123");
        String filename = "student.ser";

        // ==========================================
        // 1. SERIALIZATION (Object -> Byte Stream -> File)
        // ==========================================
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(student1);
            System.out.println("Object successfully serialized to " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ==========================================
        // 2. DESERIALIZATION (File -> Byte Stream -> Object)
        // ==========================================
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Student deserializedStudent = (Student) in.readObject();

            System.out.println("\nObject successfully deserialized!");
            System.out.println("Name: " + deserializedStudent.name);
            System.out.println("Age: " + deserializedStudent.age);
            
            // Output is null because 'password' was marked transient
            System.out.println("Password: " + deserializedStudent.password); 

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}