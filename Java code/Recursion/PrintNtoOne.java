import java.util.Scanner;

public class PrintNtoOne {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if(n== 0) return;
        System.out.println(n);
        n--;
        printOneToN(n);
    }
}