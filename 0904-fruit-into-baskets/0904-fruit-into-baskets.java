class Solution {
    public int totalFruit(int[] fruits) {
        
        int left = 0;
        int max = 0;

        int b1 = -1;
        int b2 = -1;

        for (int right = 0; right < fruits.length; right++) {

            int current = fruits[right];

            // Assign baskets if empty
            if (b1 == -1 || current == b1) 
            {
                b1 = current;
            } 
            else if (b2 == -1 || current == b2)
             {
                b2 = current;
            } 
            else 
            {
                // Third fruit type → shrink window
                left = right - 1;

                // Move left backward to keep last continuous fruit type
                while (left >= 0 && fruits[left] == fruits[right - 1])
                 {
                    left--;
                }

                left++;

                // Reset baskets
                b1 = fruits[right - 1];
                b2 = current;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}