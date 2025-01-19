package interval;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        InsertIntervals sol = new InsertIntervals();
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        //int[][] result = sol.insert(intervals, newInterval);

        // Print the result
//        System.out.print("[");
//        for (int[] interval : result) {
//            System.out.print("[" + interval[0] + "," + interval[1] + "]");
//        }
//        System.out.println("]");
    }

    private void insert(int[][] intervals, int[] newInterval) {

        List<int[]> ansList=new ArrayList<>();
        int n=intervals.length;
        boolean isInserted=false;

        for (int i = 0; i < n; i++) {
            if (intervals[i][1]<newInterval[0]){
                ansList.add(intervals[i]);
            } else if (intervals[i][0]>newInterval[1]) {

                if (!isInserted){

                }

                ansList.add(intervals[i]);
            }


        }

    }
}