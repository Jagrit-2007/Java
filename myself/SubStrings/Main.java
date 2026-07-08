package SubStrings;

public class Main{

    public static void main(String[] args){

        // .substring() : a method used to extract a portion of string 
        //                .substring(start, end)
        //               it will return a new string

        String email = "abc123@gmail.com";
        String username = email.substring(0, 6);
        String domain = email.substring(7, 16);

        // its okay to use (7) because after it , it would be auto

        System.out.println(username); // abc123
        System.out.println(domain); // gmail.com

        // a better approach

        String randomEmail = "helloJag123@gmail.com";
        String UserName = randomEmail.substring(0, randomEmail.indexOf("@"));
        String Domain = randomEmail.substring(randomEmail.indexOf("@") + 1);

        System.out.println(UserName); // helloJag123
        System.out.print(Domain); // gmail.com

    }
}