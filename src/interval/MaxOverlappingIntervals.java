package interval;

import java.util.Arrays;

public class MaxOverlappingIntervals {

    public static int maxOverlappingIntervals(int[][] intervals) {
        int n = intervals.length;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];

        // Extract start and end times from intervals
        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }

        // Sort the start and end times
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int maxCount = 0;
        int currentCount = 0;
        int i = 0, j = 0;

        // Traverse the start and end times to count overlaps
        while (i < n && j < n) {
            if (startTimes[i] < endTimes[j]) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
                i++;
            } else {
                currentCount--;
                j++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 5}, {3, 6}, {7, 9}};
        int result = maxOverlappingIntervals(intervals);
        System.out.println("Maximum Overlapping Intervals: " + result); // Output should be 3
    }
}
