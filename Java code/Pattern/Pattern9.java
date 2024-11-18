import java.util.Scanner;

public class Pattern9 {
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
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >= i && j < (2*n - i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
