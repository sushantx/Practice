import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
