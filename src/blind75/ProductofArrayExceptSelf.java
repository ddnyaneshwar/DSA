package blind75;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int[] result=findProductOfArray(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findProductOfArray(int[] arr) {
        int[] prefix=new int[arr.length];
        int[] sufix=new int[arr.length];
        int[] result=new int[arr.length];

        prefix[0]=1;

        for (int i = 1; i < arr.length; i++) {
            prefix[i]=arr[i-1]*prefix[i-1];
        }
        // [1,2,6,24]
        sufix[arr.length-1]=1;

        for (int i=arr.length-2; i>= 0;i--){
            sufix[i]= sufix[i+1]*arr[i+1];
        }

        for (int i=0 ; i< arr.length;i++){
            result[i]=prefix[i]*sufix[i];
        }
        return result;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] rst = new int[nums.length];
        if (nums == null || nums.length == 0) {
            return rst;
        }

        rst[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rst[i] = rst[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            rst[i] *= right;
            right *= nums[i];
        }

        return rst;
    }
}
