class Solution {
    public int maxSubarraySum(int[] arr, int k) 
    
    {
      
      int maxsum = Integer.MIN_VALUE;
       
      int left = 0;
      int total = 0;
      int length=0;
     
     for(int right=0;right<arr.length;right++)
     {
         total += arr[right];
         length++;
         if(length==k )
         {
           maxsum=Math.max(maxsum,total); 
           total-=arr[left];
           left++;
           length--;
         }
         
          
     }
     if (maxsum == Integer.MIN_VALUE)
            return 0;
     return maxsum;
    }
}