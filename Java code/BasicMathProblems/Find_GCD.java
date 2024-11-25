import java.util.Scanner;

//public class Find_GCD {
//    public static void main(String[] args) {
//        System.out.println("Enter the two number:");
//        Scanner sc = new Scanner(System.in);
//        int n1 = Integer.parseInt(sc.nextLine());
//        int n2 = Integer.parseInt(sc.nextLine());
//        int gcd=findGCD(n1,n2);
//        System.out.printf("GCD of %d & %d is %d%n", n1, n2, gcd);
//        sc.close();
//    }
//
//    private static int findGCD(int n1,int n2) {
//        int result=0;
//        for(int i=1;i<=Math.max(n1, n2);i++){
//            if(n1%i==0 && n2%i ==0) result =i;
//        }
//            return result;
//    }
//}

import java.util.Scanner;

//public class Find_GCD {
//    public static void main(String[] args) {
//        System.out.println("Enter the two numbers:");
//        Scanner sc = new Scanner(System.in);
//        int n1 = Integer.parseInt(sc.nextLine());
//        int n2 = Integer.parseInt(sc.nextLine());
//        int gcd = findGCD(n1, n2);
//        System.out.printf("GCD of %d & %d is %d%n", n1, n2, gcd);
//        sc.close();
//    }
//
//    private static int findGCD(int n1, int n2) {
//        int result = 1;
//        int maxNumber = Math.max(n1, n2);
//        for (int i = maxNumber; i >= 1; i--) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                result = i;
//                break;
//            }
//        }
//        return result;
//    }
//}


//Euclidean Algorithm find GCD
/*To find the GCD of n1 and n2 where n1 > n2:
Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
Once one of them becomes 0, the other number is the GCD of the original numbers.*/

public class Find_GCD {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int gcd = findGCD(n1, n2);
        System.out.printf("GCD of %d & %d is %d%n", n1, n2, gcd);
        sc.close();
    }

    private static int findGCD(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }
}
