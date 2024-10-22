package slidingwindow;

public class FindMaximumSubArrayOfSizeK {
    /*
    Find maximum (or minimum) sum of a subarray of size k
    Input  : arr[] = {100, 200, 300, 400},  k = 2
    Output : 700

    Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
    Output : 39
    Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

    Input  : arr[] = {2, 3}, k = 3
    Output : Invalid
    Explanation: There is no subarray of size 3 as size of whole array is 2.

    https://algo.monster/liteproblems/209
     */
    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        int k=2;
        int result=findMaximumSum(arr,k);
        System.out.println(result);
        int result1=findMinimumSum(arr,k);
        System.out.println(result1);
    }

    private static int findMaximumSum(int[] arr, int k) {
       int maxSum=0;
       int left=0;
       int currentSum=0;

       for(int right=0;right<arr.length;right++){
           currentSum+=arr[right];
           if (right>=k-1){
               maxSum=Math.max(currentSum,maxSum);
               currentSum-=arr[left];
               left++;
           }
       }
       return maxSum;
    }

    private static int findMinimumSum(int[] arr, int k) {
        int maxSum=Integer.MAX_VALUE;
        int left=0;
        int currentSum=0;

        for(int right=0;right<arr.length;right++){
            currentSum+=arr[right];
            if (right>=k-1){
                maxSum=Math.min(currentSum,maxSum);
                currentSum-=arr[left];
                left++;
            }
        }
        return maxSum;
    }
}
