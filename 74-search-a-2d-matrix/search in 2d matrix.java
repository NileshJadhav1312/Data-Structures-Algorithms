class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // 1. Find the potential row
        int i = 0;
        while (i < rows) 
        {
            // If target is within the range of this row
            if (target <= matrix[i][cols - 1])
            {
                break;
            }
            i++;
        }

        // 2. If i reached rows, the target is larger than anything in the matrix
        if (i == rows) return false;

        // 3. Binary search within the identified row i
        int start = 0;
        int end = cols - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents potential overflow
            if (matrix[i][mid] == target) {
                return true;
            } else if (matrix[i][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return false;    
    }
}
