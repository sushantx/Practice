import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the integer Digit:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean isPrime = primeNumber(n);
        System.out.printf("Is Prime %b",isPrime);
        sc.close();
    }

    private static boolean primeNumber(int n) {
        int cnt =0;
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; ++i) {
            if (n % i == 0) {
                cnt++;
                if (n / i != i) {
                   cnt++;
                }
            }
        }
        return cnt==2;
    }
}