class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int answer = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
    
            if (nums[start] <= nums[mid]) //this main loop checking arrays right part and left part
            {
                if (nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return answer;
    }
}