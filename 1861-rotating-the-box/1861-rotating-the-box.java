class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        
        // Number of rows in original matrix
        int nr = boxGrid.length;
        
        // Number of columns in original matrix
        int nc = boxGrid[0].length;

        // -------------------------------
        // STEP 1: APPLY GRAVITY (RIGHT SIDE)
        // -------------------------------
        // We process each row independently
        for (int i = 0; i < nr; i++) {
            
            // 'empty' keeps track of the rightmost position
            // where a stone '#' can fall
            int empty = nc - 1;

            // Traverse row from right to left
            for (int j = nc - 1; j >= 0; j--) {

                // If we find an obstacle '*'
                if (boxGrid[i][j] == '*') {
                    // Reset empty position to just left of obstacle
                    empty = j - 1;
                }

                // If we find a stone '#'
                else if (boxGrid[i][j] == '#') {

                    // Swap current stone with the 'empty' position
                    char temp = boxGrid[i][empty];
                    boxGrid[i][empty] = '#';
                    boxGrid[i][j] = temp;

                    // Move empty pointer left (next available spot)
                    empty--;
                }

                // If it's '.', do nothing (empty space)
            }
        }

        // -------------------------------
        // STEP 2: ROTATE MATRIX 90° CLOCKWISE
        // -------------------------------

        // Create new matrix with swapped dimensions
        char[][] result = new char[nc][nr];

        // Traverse original matrix
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {

                // Place element at rotated position
                // Formula: (i, j) → (j, nr - 1 - i)
                result[j][nr - 1 - i] = boxGrid[i][j];
            }
        }

        // Return final rotated matrix
        return result;
    }
}