import java.util.Scanner;

public class RecursionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms to display:");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.out.println("No Fibonacci numbers to display.");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            System.out.print("0");
            printFibonacci(0, 1, n, 1);
        }
    }
    private static void printFibonacci(int a, int b, int n, int count) {
        if (count >= n) return;
        System.out.print(", " + b);
        printFibonacci(b, a + b, n, count + 1);
    }
}


