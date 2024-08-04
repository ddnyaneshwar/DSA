package leetcode;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        int[] nums= {1,3,2,4,1,2,3,4,5};
        int nonRepeatingNumber=nums[0];

        for(int i=1;i< nums.length;i++){
            nonRepeatingNumber=nums[i]^nonRepeatingNumber;
        }
        System.out.println(nonRepeatingNumber);

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.add(nums[i])) nonRepeatingNumber=nums[i];
        }
        System.out.println(nonRepeatingNumber);
    }
}
