import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >= (n - i - 1) && j <= (n + i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// public class Pattern7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the value of n");
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.nextLine());
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 2 * i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }