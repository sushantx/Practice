import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the integer Digit:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean isArmStrong = isArmStrong(n);
        System.out.printf("isArmStrong: %b", isArmStrong);
        sc.close();
    }

    private static boolean isArmStrong(int n) {
        int originalNumber = n;
//        int totalDigits = (n == 0) ? 1 : (int) (Math.log10(Math.abs(n)) + 1);
        int totalDigits = String.valueOf(originalNumber).length();
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum  += (int) Math.pow(lastDigit, totalDigits);
            n = n / 10;
        }
        return originalNumber == sum;
    }
}
