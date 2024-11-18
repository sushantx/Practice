import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc =new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
