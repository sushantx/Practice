import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.println("Enter the the value of N");
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        char pattern= (char) ('A'+n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (pattern-j));
            }
            System.out.println();
        }
        sc.close();
    }
}