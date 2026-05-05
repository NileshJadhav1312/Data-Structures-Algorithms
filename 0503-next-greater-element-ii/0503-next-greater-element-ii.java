import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse twice (circular)
        for (int i = 2 * n - 1; i >= 0; i--) 
        {

            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) 
            {
                stack.pop();
            }

            // Only fill answer in first pass
            if (i < n) {
                if (stack.isEmpty()) 
                {
                    ans[i] = -1;
                } else {
                    ans[i] = stack.peek();
                }
            }

            stack.push(nums[i % n]);
        }
        return ans;
    }
}