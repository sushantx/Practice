import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<2*n-1;i++){
            for (int j=0;j<n;j++){
                if(j<=i && i<n)
                    System.out.print("*");
                if(j<=2*n-i-2 && i>=n)
                    System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
