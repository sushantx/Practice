import java.util.Scanner;
/*
1
01
101
0101
10101
 */
public class Pattern11 {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
