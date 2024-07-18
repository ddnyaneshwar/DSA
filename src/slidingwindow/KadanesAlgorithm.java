package slidingwindow;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        /*
        *
        * https://leetcode.com/problems/maximum-subarray/description/
        * Given an integer array nums, find the
            subarray
            with the largest sum, and return its sum.
            Example 1:

            Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
            Output: 6
            Explanation: The subarray [4,-1,2,1] has the largest sum 6.
        * */
        int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int max_sum_so_far=nums[0];
        int current_sum=nums[0];
        for(int i=1;i<nums.length; i++){
            current_sum=Math.max(nums[i],nums[i] + current_sum);
            max_sum_so_far=Math.max(current_sum,max_sum_so_far);
        }
        return max_sum_so_far;
    }
}
