package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {3,2,3,0,2,0,4};

        int nonzeroIndex=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[nonzeroIndex++]=arr[i];
            }
        }
        while (nonzeroIndex<arr.length)
            arr[nonzeroIndex++]=0;
        System.out.println(Arrays.toString(arr));
    }
}
