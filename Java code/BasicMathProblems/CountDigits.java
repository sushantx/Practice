import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.cos;

//public class CountDigits {
//    public static void main(String[] args) {
//        System.out.println("Enter the integer Digit:");
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int count = 0;
//        if (n == 0) {
//            count++;
//        } else {
//            while (!(n % 10 == 0)) {
//                n = n / 10;
//                count++;
//            }
//        }
//        System.out.println("Total No. of Digit:" + count);
//        sc.close();
//    }
//}

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter the integer Digit:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = (n == 0) ? 1 : (int) (Math.log10(Math.abs(n)) + 1);
        System.out.println("Total No. of Digit:" + count);
        sc.close();
    }
}

