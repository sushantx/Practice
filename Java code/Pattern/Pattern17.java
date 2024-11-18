import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=2*n-1; j++) {
                if (j >= (n - i - 1) && j <= (n + i - 1)){
                    System.out.print((char) ('A' + j));
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
            sc.close();
        }
    }
}
