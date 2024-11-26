import java.util.Arrays;

//public class ReverseArray {
//    public static void main(String[] args) {
//        int [] arr ={0,1,2,3,4};
//
//        int[] res = new int[5];
//        reverseArray(0, arr, res);
//        System.out.println(Arrays.toString(res));
//    }
//
//    private static void reverseArray(int idx, int[] arr, int[] res) {
//        if(idx >= arr.length) return;
//        res[arr.length - idx - 1] = arr[idx];
//        reverseArray(idx+1, arr, res);
//    }
//}

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] result = new int[5];
        reverseArray(0,arr,result);
        System.out.println(Arrays.toString(result));
    }

    private static void reverseArray(int index,int []arr, int []result) {
        if (index==arr.length) return;
        result[index]= arr[arr.length-index-1];
        reverseArray(index+1,arr,result);
    }
}