import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {1,11,10,5,2,0};
        int n =6;
        insertionSorting(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSorting(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
