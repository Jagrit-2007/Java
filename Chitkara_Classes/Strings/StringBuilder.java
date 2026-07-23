package Strings;
//input  - programming

//output -  proming

import java.util.Scanner;

public class StringBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.delete(3, 7);

        System.out.println(sb);
        sc.close();
    }
}

//intput- hello world
//output - olleh dlrow


// wpa print output
//input - ysae si avaj

//remove duplicate using string builder method

//do string compress
//input - aaabbccccd
//output-  a3b2c4d1