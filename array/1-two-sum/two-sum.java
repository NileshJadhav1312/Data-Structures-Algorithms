//import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target)
     {
        for (int i = 0; i < nums.length; i++)
         {
            for (int j = i + 1; j < nums.length; j++)
             {
                if (nums[i] + nums[j] == target) 
                {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return new int[]{}; // return empty if no pair found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result[] = sol.twoSum(arr, 7);
        
        System.out.println(Arrays.toString(result));
    }
}
