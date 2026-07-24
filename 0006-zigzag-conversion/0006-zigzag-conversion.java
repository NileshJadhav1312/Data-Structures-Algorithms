class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int n = s.length();
        char[][] arr = new char[numRows][n];

        int index = 0;
        int col = 0;

        while (index < n) 
        {
            // Vertical Down
            for (int row = 0; row < numRows && index < n; row++) 
            {
                arr[row][col] = s.charAt(index++);
            }

            // Diagonal Up
            for (int row = numRows - 2; row >= 1 && index < n; row--) 
            {
                col++;
                arr[row][col] = s.charAt(index++);
            }

            col++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != '\u0000') {
                    ans.append(arr[i][j]);
                }
            }
        }

        return ans.toString();
    }
}