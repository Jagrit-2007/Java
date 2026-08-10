package JAVA_IMP.QUESTIONS.OOPS;
import java.util.Scanner;

abstract class LibraryMember{

    // abstract method
    abstract int calculateBorrowLimit(); // making it neccesary to override

    // static variable belongs entirely to class not just to an it's object
    static int counter;

}

class StudentMember extends LibraryMember{

    String memberName;
    int memberId;
    int choice;
    private int academicYear;

    StudentMember(int memberId, int choice, int academicYear, String memberName){
        this.memberName = memberName;
        this.memberId = memberId;
        this.choice = 1;
        this.academicYear = academicYear;
    }

    @Override
    // Override methods need "access modifiers"
    public int calculateBorrowLimit(){
        int canIssue =  5 * academicYear;
        return canIssue;
    }

    void display(){
        
        // counter is used in display method , i.e when object is created
        counter++;
        System.out.print("Member: " + memberName + " | Borrow Limit: " + calculateBorrowLimit());
        System.out.println();
        System.out.println("Total member Issued: " + counter);
    }
}

class ProffesorMember extends LibraryMember{

    String memberName;
    int memberId;
    int choice;
    private String department;

    ProffesorMember(int memberId, int choice, String department, String memberName){
        this.memberName = memberName;
        this.memberId = memberId;
        this.choice = 2;
        this.department = department;
    }

    @Override
    public int calculateBorrowLimit(){
        int canIssue = 20;
        return canIssue;
    }

    void display(){
        counter ++;
        System.out.print("Member: " + memberName + " | Borrow Limit: " + calculateBorrowLimit());
        System.out.println();
        System.out.println("Total member Issued: " + counter);
    }
}

public class oopsInOne {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // Input format 1
        System.out.print("Enter your choice (1 = Student , 2 = Proffesor): ");
        int choice = scanner.nextInt();

        // Buffer clean
        System.out.println();

        // Input format 2
        System.out.print("Enter your name: ");
        String memberName = scanner.next();

        System.out.println();

        System.out.print("Enter your ID: ");
        int memberId = scanner.nextInt();

        System.out.println();

        // Input format 3 (inside the conditional statements)
        if(choice == 1)
        {
            System.out.print("Enter academic year: ");
            int academicYear = scanner.nextInt();

            // Creating a student object
            StudentMember studentMember = new StudentMember(memberId, choice, academicYear, memberName);
            studentMember.display();
        }
        else if(choice == 2)
        {
            System.out.print("Enter your department: ");
            String department = scanner.next();

            // Creating a proffesor object
            ProffesorMember proffesorMember = new ProffesorMember(memberId, choice, department, memberName);
            proffesorMember.display();
        }
        else
        {
            System.out.println("Please enter a valid choice!");
        }
    
        scanner.close();
    }
}