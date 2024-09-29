package leetcode;

import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int[] arr= {5,2,1,2,3,2,3,2,1,2,1,1};
        int k=2;

        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for (int i=0 ; i< arr.length ;i ++){
            frequencyMap.put(arr[i],frequencyMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(frequencyMap);

        List<Map.Entry<Integer,Integer>> list =new ArrayList<>(frequencyMap.entrySet());

        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Integer, Integer> integerIntegerEntry : list) {

        }

        System.out.println(list);

        }
}
