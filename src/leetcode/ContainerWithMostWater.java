package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int n= height.length;
        int currentArea=0;
        int maxArea=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            currentArea=(right-left) * Math.min(height[left], height[right]);
            maxArea=Math.max(maxArea,currentArea);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}

