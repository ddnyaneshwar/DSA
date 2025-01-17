package interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{8, 10},{1, 3}, {2, 6}, {15, 18}};

        mergeIntervals(intervals);
    }

    private static void mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> list=new ArrayList<>();
        for(int[] current :intervals){
            if(list.isEmpty())
                list.add(current);
            else{
                int[] prev=list.get(list.size()-1);
                if(prev[1]>current[0]){
                    prev[1]=Math.max(current[1],prev[1]);
                }else {
                    list.add(current);
                }
            }
        }

        System.out.println(Arrays.deepToString(list.toArray()));

    }


}



































/*

private static void mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> merged =new ArrayList<>();
        int[] prevInterval=intervals[0];
        merged.add(prevInterval);
        System.out.println("After sorting : "+ Arrays.deepToString(intervals));
        for(int[] interval: intervals){
            if (interval[0] <= prevInterval[1]){
                prevInterval[1]=Math.max(prevInterval[1],interval[1]);
            }else {
                prevInterval=interval;
                merged.add(prevInterval);
            }
        }
        System.out.println("After Merging : "+ Arrays.deepToString(merged.toArray()));
        merged.toArray(new int[merged.size()][]);
    }
 */