class Solution {
    // use two pointers algorithm
    public int removeDuplicates(int[] nums) 
    {  

        if(nums.length==1)
        {
            return 1;
        }
        if(nums.length==0)
        {
            return 0;
        }

         int pos=0;
         //int temp=1;
         int k=1;
         for(int i=1;i<nums.length;i++)
         {
            
            if(nums[i]!=nums[pos])
            {
                pos++;
                nums[pos]=nums[i];
                k++;
            }
         }
 return k;
    }
}