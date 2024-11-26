import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = sumOfNumber(n);
        System.out.println(result);
    }

    private static int sumOfNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNumber(n - 1);
    }
}

//public class SumOfNnumbers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int result = sumOfNumber(n, 0);
//        System.out.println(result);
//    }
//
//    private static int sumOfNumber(int n, int result) {
//        if (n == 0) {
//            return result;
//        }
//        return sumOfNumber(n - 1, result + n);
//    }
//}


//class Recursion {
//
//    static void func(int i, int sum){
//
//        // Base Condition.
//        if(i<1){
//
//            System.out.println(sum);
//            return;
//        }
//
//        // Function call to increment sum by i till i decrements to 1.
//        func(i-1,sum+i);
//
//
//    }
//    public static void main(String[] args) {
//
//        // Here, let’s take the value of n to be 3.
//        int n = 3;
//        func(n,0);
//    }
//}


//class Recursion {
//
//    static int func(int n){
//
//        // Base Condition.
//        if(n == 0){
//            return 0;
//        }
//
//        // Problem broken down into 2 parts and then combined.
//        return n + func(n-1);
//
//
//    }
//    public static void main(String[] args) {
//
//        // Here, let’s take the value of n to be 3.
//        int n = 3;
//        System.out.println(func(n));
//    }
//}