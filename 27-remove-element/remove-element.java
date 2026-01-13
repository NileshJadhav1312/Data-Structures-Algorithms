class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // pointer for position to place non-val elements

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // new length of array without val
    }
}
