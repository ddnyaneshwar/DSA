package arrays;

import java.util.Arrays;

public class FIndMissingPositive {
    public static void main(String[] args) {
        //int[] arr={2, -3, 4, 1, 1, 7};
        //int[] arr={5, 3, 2, 5, 1};
        int[] arr={-8, 0, -1, -4, -3};
        Arrays.sort(arr);
        int missing=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>0 && arr[i-1]>0){
                if(arr[i]-arr[i-1]>1){
                    missing=arr[i-1]+1;
                    break;
                }
            }
        }

        System.out.println("Missing :"+missing);
    }
}
