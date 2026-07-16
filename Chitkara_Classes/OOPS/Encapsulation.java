package Chitkara_Classes.OOPS;


class Employee{

    private String name;
    private int id;
    
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }

    void setName(String name){
        this.name = name;
    }
    void setId(int id){
        this.id = id;
    }

}
public class Encapsulation {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        // employee1.name = "XYZ";
        System.out.println(employee1.getName());
        // employee1.name = "QWE";
        System.out.println(employee1.getName());

    }
}
    
