package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        sort(arr);
    }

    private static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int currentValue= arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>currentValue){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=currentValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
