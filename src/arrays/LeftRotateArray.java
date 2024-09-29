package arrays;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=6;
        int[] ans=letfRotateByK(arr,k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] letfRotateByK(int[] arr, int k) {
        k%= arr.length;

        int[] left= new int[k];

        for (int i = 0; i < left.length; i++) {
            left[i]=arr[i];
        }
        int startInd=0;
        for (int i = k; i < arr.length; i++) {
            arr[startInd++]=arr[i];
        }
        for (int i = 0; i < left.length; i++) {
            arr[startInd++]=left[i];
        }

        return arr;
    }
}
