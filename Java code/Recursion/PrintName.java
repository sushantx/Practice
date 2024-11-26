import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printName(n);
    }

    private static void printName(int n) {
        if(n==0) return;
        System.out.println("Sushant");
        printName(--n);
    }
}
