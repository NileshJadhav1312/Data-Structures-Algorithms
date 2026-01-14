import java.util.HashSet;
import java.util.Set;

class Solution {

    public void setZeroes(int[][] matrix) {

        Set<Integer> setrow = new HashSet<>();
        Set<Integer> setcol = new HashSet<>();

        // Step 1: store rows and columns with zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    setrow.add(i);
                    setcol.add(j);
                }
            }
        }

        // Step 2: zero out rows
        for (int r : setrow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[r][j] = 0;
            }
        }

        // Step 3: zero out columns
        for (int c : setcol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}
