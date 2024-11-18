import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int temp=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j<=i)
                    System.out.print(temp++);
            }
            System.out.println();
        }
        sc.close();
    }
}
