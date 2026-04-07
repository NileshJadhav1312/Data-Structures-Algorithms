import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            int[] curr = intervals[i];

            // Step 2: Check overlap
            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]); // merge
            } else {
                result.add(curr); // new interval
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}