import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc =new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<=(n-i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
