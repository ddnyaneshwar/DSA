package leetcode;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] nums={1,-3,5,4,3,6,-7};
        int maxSoFar=nums[0];
        int currentMax=nums[0];
        for (int i = 0; i < nums.length; i++) {
            currentMax=Math.max(nums[i],nums[i]+currentMax);
            maxSoFar=Math.max(maxSoFar,currentMax);
        }
        System.out.println(maxSoFar);
    }
}
