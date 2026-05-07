class Solution {
    public int[] maxValue(int[] nums) {
        
        int n = nums.length;

        int maxprefix[] = new int[n];
        int minsuffix[] = new int[n];

        maxprefix[0] = nums[0];
        minsuffix[n-1] = nums[n-1];

        for(int i=1; i<nums.length; i++) {
            maxprefix[i] = Math.max(nums[i], maxprefix[i-1]);
        }

        for(int i=n-2; i>=0; i--) {
            minsuffix[i] = Math.min(nums[i], minsuffix[i+1]);
        }

        int ans[] = new int[n];

        ans[n-1] = maxprefix[n-1];


        for(int i=n-2; i>=0; i--) {
            if(maxprefix[i] > minsuffix[i+1])
                ans[i] = ans[i+1];
            else ans[i] = maxprefix[i];
        }

        return ans;
    }
}
// class Solution {
//     public int[] maxValue(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];

//         // each node initially reaches itself
//         for (int i = 0; i < n; i++) {
//             ans[i] = nums[i];
//         }

//         // propagate improvements
//         for (int i = 0; i < n; i++) {

//             // go right: nums[j] < nums[i]
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[j] < nums[i]) {
//                     ans[i] = Math.max(ans[i], ans[j]);
//                 }
//             }

//             // go left: nums[j] > nums[i]
//             for (int j = i - 1; j >= 0; j--) {
//                 if (nums[j] > nums[i]) {
//                     ans[i] = Math.max(ans[i], ans[j]);
//                 }
//             }
//         }

//         return ans;
//     }
// }