import java.util.Scanner;

//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        System.out.println(fibonacci(n));
//    }
//
//    private static int fibonacci(int n) {
//        if(n <= 1) return n;
//        return fibonacci(n-1) + fibonacci(n-2);
//    }
//}


//import java.util.Scanner;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        // Check if input is non-negative
//        if (n < 0) {
//            System.out.println("Please enter a non-negative integer.");
//        } else {
//            System.out.println(fibonacci(n));
//        }
//    }
//
//    private static int fibonacci(int n) {
//        // Handle base cases directly
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        // Use two variables to store previous two Fibonacci numbers
//        int a = 0, b = 1;
//
//        // Compute Fibonacci iteratively
//        for (int i = 2; i <= n; i++) {
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//
//        return b;  // b holds the nth Fibonacci number
//    }
//}



//import java.util.Scanner;
//import java.util.HashMap;
//
//public class Fibonacci {
//    // Memoization map to store already calculated Fibonacci numbers
//    private static HashMap<Integer, Integer> memo = new HashMap<>();
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        // Check if input is valid (non-negative integer)
//        if (n < 0) {
//            System.out.println("Please enter a non-negative integer.");
//        } else {
//            System.out.println(fibonacci(n));
//        }
//    }
//
//    private static int fibonacci(int n) {
//        // Check the memoization map for previously computed results
//        if (memo.containsKey(n)) {
//            return memo.get(n);
//        }
//
//        // Base cases
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        // Recursively calculate Fibonacci number and store it in the memo map
//        int result = fibonacci(n - 1) + fibonacci(n - 2);
//        memo.put(n, result);
//
//        return result;
//    }
//}



public class Fibonacci {

    // Recursive function to return the nth Fibonacci number
    public static int recurFibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recurFibo(n - 1) + recurFibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int nterms = 10; // Number of terms in Fibonacci sequence

        // Check if the number of terms is valid
        if (nterms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci sequence:");

            // Loop through and print the Fibonacci sequence
            for (int i = 0; i < nterms; i++) {
                System.out.println(recurFibo(i));
            }
        }
    }
}
