package arrays;

import java.util.HashMap;
import java.util.Map;

public class FIndNonreapitingNumber {
    public static void main(String[] args) {
        int[] arr= {1,2,3,6,1,2,3};
        System.out.println(findNonRepeating(arr));
        System.out.println(findNonRepeating1(arr));
    }

    private static int findNonRepeating(int[] arr) {
        int num=arr[0];
        for (int i = 1; i < arr.length; i++) {
            num=num^arr[i];
        }
        return num;
    }

    private static int findNonRepeating1(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (var entry:map.entrySet())
            if(entry.getValue()==1)return entry.getKey();
        return -1;
    }

}
