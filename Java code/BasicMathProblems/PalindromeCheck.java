import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter the integer Digit:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Palindrome: " + isPalindrome(n));
        sc.close();
    }

    private static boolean isPalindrome(int n) {
        int originalValue = n;
        int reverseNumber = 0;
        while (n != 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n = n / 10;
        }
        return reverseNumber == originalValue;
    }
}

