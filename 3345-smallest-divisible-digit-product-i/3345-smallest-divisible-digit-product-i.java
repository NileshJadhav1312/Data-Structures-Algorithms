class Solution {
    public int smallestNumber(int n, int t) 
    {
        for (int i = n; i <= 100; i++) 
        {
            int prd = 1;
            int temp = i;

            while (temp > 0) 
            {
                int dig = temp % 10;
                prd *= dig;
                temp /= 10;
            }

            if (prd % t == 0) {
                return i;
            }
        }

        return -1;
    }
}