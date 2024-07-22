package leetcode;

import java.util.Arrays;

public class LeetCode4MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1={1,2,4};
        int[] nums2={3,5}; // 1,2,3,4,5,6
        int total=(nums1.length+nums2.length);
        int mid=total/2;
        double median=0;

        int[] mergedArray=mergeSortedArray(nums1,nums2,mid);
        if (total%2!=0)
            median=mergedArray[mid];
        else
            median=(mergedArray[mid]+mergedArray[mid-1])/2.0;
        System.out.println(median);
    }

    private static int[] mergeSortedArray(int[] nums1, int[] nums2, int mid) {
        int ptr1=0;
        int ptr2=0;
        int ptr3=0;
        int[] sortedArray=new int[nums1.length+nums2.length];

        while (ptr1<nums1.length && ptr2<nums2.length){
            if(nums1[ptr1]<=nums2[ptr2])
                sortedArray[ptr3++]=nums1[ptr1++];
            else
                sortedArray[ptr3++]=nums2[ptr2++];
        }
        while (ptr2<nums2.length)
            sortedArray[ptr3++]=nums2[ptr2++];
        while (ptr1<nums1.length)
            sortedArray[ptr3++]=nums1[ptr1++];
        return sortedArray;
    }
}








/*
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total = nums1.length + nums2.length ;
        int mid = total/2;

        int[]  mergedArr = mergedArray( nums1, nums2 , mid);

        if( total%2 !=0 ) // total is odd
            return (double) mergedArr[mid];
        else  // total is even
            return ((double) mergedArr[mid] + mergedArr[mid-1])/2;

    }

   public int[] mergedArray(int[] n1, int[] n2, int mid)
   {
      int[] merged = new int[mid+1];
      int ptr1 = 0;
       int ptr2 = 0;
       int ptr3 = 0;

       if (n1.length == 0 ) return n2;
       if (n2.length == 0 ) return n1;

       while(ptr1<n1.length && ptr2 < n2.length & ptr3 <= mid)
       {
          if(n1[ptr1] < n2[ptr2])
              merged[ptr3++] = n1[ptr1++];
           else
              merged[ptr3++] = n2[ptr2++];
       }

      while(ptr2<n2.length && ptr3 <=mid)
          merged[ptr3++] = n2[ptr2++];

       while(ptr1<n1.length && ptr3 <=mid)
          merged[ptr3++] = n1[ptr1++];

      return merged;

   }

}
 */