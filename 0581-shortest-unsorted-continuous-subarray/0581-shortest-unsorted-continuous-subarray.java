class Solution {
    public int findUnsortedSubarray(int[] nums) 
    {
        int n = nums.length;
        int start = -1, end = -2; // initialize for already sorted array case
        int min = nums[n - 1], max = nums[0];

        for (int i = 1; i < n; i++) 
        {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);

            if (nums[i] < max) end = i;
            if (nums[n - 1 - i] > min) start = n - 1 - i;
        }

        return end - start + 1;
    }
}
// class Solution {
//     public int findUnsortedSubarray(int[] nums) 
    
//     {
//     int start=0;
//     int end=nums.length-1;
//     int count=0;
//     int length=0;
//     while(start<=end)
//     {
//       if(nums[start]<=nums[start+1])
//       {
//         start++;
//         count++;
//       }

//       else if(nums[end]>=nums[end-1])
//       {
//         end--;
//         count++;
//       } 
//       else{
//         length=nums.length-count;
//       }  
//     }
//    return length;
//     }
// }