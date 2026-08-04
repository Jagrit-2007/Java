package StaticKeyword;


class Friends{

    int numOfFriends = 0;
    static int totalNumOfFriends = 0;
    static int age = 0;
    String name;

    Friends(String name){
        this.name = name;
        numOfFriends++;
        totalNumOfFriends++;
    }
    static void display(){
        // no need of "this." here because we have already used static to define totalNumOfFriends
        System.out.println("Total number of friends: "+ totalNumOfFriends); // 
    }
}
public class Main {
    
    public static void main(String[] args) {
        
        // Static : makes a variable or method belonging to the class rathar than any object
        // "static" keyword can be used as "static block", "static class" and "static method"

        Friends friend1 = new Friends("Jagrit");
        Friends friend2 = new Friends("Meoww");
        Friends friend3 = new Friends("Meoww");
        Friends friend4 = new Friends("Meoww");
        Friends friend5 = new Friends("Meoww");



        System.out.println(friend1.numOfFriends);
        // when we are accessing static variable use Class only
        System.out.println(Friends.totalNumOfFriends);

        System.out.println(friend2.numOfFriends);
        System.out.println(Friends.totalNumOfFriends);

        Friends.display();
    }
}
