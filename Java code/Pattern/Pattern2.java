import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the the value of N");
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
