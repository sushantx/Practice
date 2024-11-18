import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= i) {
                    System.out.print(j);
                }
                else if (j <= 2 * n - i - 1) {
                    System.out.print(" ");
                }
                else if (j >= 2 * n - i) {
                    System.out.print(2 * n - j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


//import java.util.Scanner;

//public class Pattern12 {
//    public static void main(String[] args) {
//        // Scanner to take user input
//        System.out.println("Enter N:");
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        // Outer loop for rows
//        for (int i = 1; i <= n; i++) {
//            // Left part (increasing numbers)
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//
//            // Middle part (spaces)
//            for (int j = 0; j < 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            // Right part (decreasing numbers)
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//
//            // Move to the next line
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}
