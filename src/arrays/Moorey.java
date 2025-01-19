package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Moorey {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};

        findMajority(arr);
        printMajority(arr);

    }

    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int count=0;
        int candidate=0;

        for(int num: nums){
            if(count==0){
                candidate=num;
            }

            count+= (candidate==num)? 1 : -1;
        }
        System.out.println(candidate +" "+ count);
        return null;
    }

    public static void printMajority(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans= new ArrayList<>();
        System.out.println(map.entrySet().stream().filter(entry->entry.getValue() > n /3 ).toList());
    }
}
