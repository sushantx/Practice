import java.util.Arrays;
import java.util.Scanner;
// for lower case

//public class CountOfCharInAString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int []arr = new int[26];
//        for (int i = 0; i < str.length(); i++) {
//            arr[str.charAt(i)-'a'] +=1;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
// for upper case

public class CountOfCharInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int []arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(arr));
    }
}