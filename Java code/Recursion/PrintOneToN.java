import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 1;
        printOneToN(cnt,n);
    }

    private static void printOneToN(int cnt, int n) {
        if(n== 0) return;
        System.out.println(cnt);
        cnt++;
        n--;
        printOneToN(cnt,n);
    }
}
