package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://www.designgurus.io/blind75
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;
        int[] result=findTwoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findTwoSum(int[] arr, int target) {
        Map<Integer,Integer> complementMap=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int complement=target-arr[i]; //3
            if(complementMap.containsKey(complement)){
                return new int[]{complementMap.get(complement),i};
            }
            complementMap.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
