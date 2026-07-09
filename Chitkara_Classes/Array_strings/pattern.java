package Chitkara_Classes.Array_strings;

public class pattern {
    // class pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// class pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// class pattern {
//     public static void main(String[] args) {
//         for (int i = 5; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// class pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// class pattern {
//     public static void main(String[] args) {
//         int num = 1;

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    
}


//wap to count even and odd in arry
//search a element in array
//reverse and stotre num innarray
//swap two number using third variable
//acept 5 digit num and print each digit seprately
}
