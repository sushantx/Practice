import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int index=0;
        System.out.printf("palindrome string: %b",isPalindrome(index,str));
    }

    private static boolean isPalindrome(int index, String str) {
        if(index == str.length()/2) return true;
        if(str.charAt(index)!=str.charAt(str.length()-index-1)) return false;
        return isPalindrome(index+1,str);
    }
}
