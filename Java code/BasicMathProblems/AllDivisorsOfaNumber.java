import java.util.ArrayList;
import java.util.Scanner;

public class AllDivisorsOfaNumber {
    public static void main(String[] args) {
        System.out.println("Enter the integer Digit:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printAllDivisors(n);
        sc.close();
    }

    private static void printAllDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        System.out.println(divisors);
    }
}
