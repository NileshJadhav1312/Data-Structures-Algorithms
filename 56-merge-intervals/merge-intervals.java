class Solution {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int arr[][] = new int[intervals.length][2];
        int row = 0;

        for (int i = 0; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            // Check if next interval overlaps
            while (i + 1 < intervals.length &&
                   intervals[i + 1][0] <= end) 
                   {

                    end = Math.max(end, intervals[i + 1][1]);
                      i++;
                    }

            arr[row][0] = start;
            arr[row][1] = end;
            row++;
        }

        return Arrays.copyOf(arr, row);
    }
}