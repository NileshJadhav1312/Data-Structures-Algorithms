class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1};
        int result = maxSubArray(arr);
        System.out.println(result);
    }
}