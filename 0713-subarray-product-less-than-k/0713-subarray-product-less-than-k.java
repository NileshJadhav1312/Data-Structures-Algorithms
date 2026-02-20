class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
     if(k <= 1) return 0;
      int left=0;
      int count=0;
      int product=1;
      for(int right=0;right<nums.length;right++)
      {
        product*=nums[right];
        while(product>=k)
        {
            product /= nums[left]; // 4*3*2=24   24/4 =6=3*2 .......removing numbers contibution from product
             left++; // shrink window and remove the value form product
        }
        count+=right-left+1;
      } 
      return count;   
    }
}