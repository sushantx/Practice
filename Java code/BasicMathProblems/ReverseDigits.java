import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println("Enter the integer Digit:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = 0;
        while (n != 0) {
            result = result * 10 + (n % 10);
            n = n / 10;
        }
        System.out.println("Reversed digit: " + result);
        sc.close();
    }
}

