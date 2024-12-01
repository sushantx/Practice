import java.util.HashMap;
import java.util.Scanner;

public class HashMapUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr [i];
            // if key is not present map give null
            mp. put(key,mp.getOrDefault(key, 0) + 1);
        }
        System.out.println(mp);
    }
}
