class Solution {
    public int findClosestNumber(int[] nums) {

        int curr = nums[0];
        int dist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int abs = Math.abs(nums[i]);

            if (abs < dist) {
                dist = abs;
                curr = nums[i];
            }
            else if (abs == dist && nums[i] > curr)  //when two numbers are equi distance then return greater one
             {
                curr = nums[i];
            }
        }

        return curr;
    }
}