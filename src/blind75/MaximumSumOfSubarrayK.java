package blind75;

public class MaximumSumOfSubarrayK {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        int k=3;
        int sum=findMaximumSum(arr,k);
        System.out.println(sum);
    }

    private static int findMaximumSum(int[] arr, int k) {
        int maxSum=0;
        int left=0;
        int currentSum=0;
        for(int right=0;right<arr.length;right++){
            currentSum+=arr[right];
            if(right>=k-1){
                maxSum=Math.max(currentSum,maxSum);
                currentSum-=arr[left];
                left++;
            }
        }
        return maxSum;
    }
}
