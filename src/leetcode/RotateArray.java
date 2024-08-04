package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int k=3;

        int[] temp=new int[k];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=nums[i];
        }
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < nums.length-k; i++) {
            nums[i]=nums[i+k];
        }
        System.out.println(Arrays.toString(nums));
        for (int i=nums.length-k,j=0; i<nums.length;i++,j++){
            nums[i]=temp[j];
        }
        System.out.println(Arrays.toString(nums));
    }
}
