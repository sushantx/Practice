import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
