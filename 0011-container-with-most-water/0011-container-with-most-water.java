class Solution {
    public int maxArea(int[] height) 
    {
        int left=0;
        int right=height.length-1;
        int maxwater=0;  // initiallyit is 0 
        int distance=height.length-1;  // distance between pole
        while(left < right)
        {
          int minheight=Math.min(height[left],height[right]); // min of pole heights
          int area=minheight*distance;  //distance->length height->minheight
          if(area>maxwater)   // updating 
          {
            maxwater=area;
          }
          if(height[left]==minheight)
          {
            left++;
            distance--;
          }
          if(height[right]==minheight)
          {
            right--;
            distance--;
          }

        }
        return maxwater;
    }
}