package arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr= {2,3,-4,5,-1,-3,-2};
        System.out.println(maxSumFromArray(arr));
    }

    private static int maxSumFromArray(int[] arr) {
        int currentSum=arr[0];
        int maxSum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum=Math.max(currentSum,arr[i]+currentSum);
            maxSum=Math.max(maxSum,currentSum);
        }

        return maxSum;
    }
}
