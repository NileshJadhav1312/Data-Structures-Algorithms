class Solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {

     int firstzero=m;
     int j=0;
 
     for(int i=firstzero;i<nums1.length;i++)
     {         
        nums1[i]=nums2[j];
        j++;
     }

     Arrays.sort(nums1);

    }
}


//class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int total = m + n;

//         // Process each element of nums2
//         for (int i = 0; i < n; i++) 
//         {

//             int val = nums2[i];
//             int j = m - 1;

//             // Shift elements in nums1 to make space
//             while (j >= 0 && nums1[j] > val) 
//             {
//                 nums1[j + 1] = nums1[j];
//                 j--;
//             }

//             // Insert element at correct position
//             nums1[j + 1] = val;

//             // One more element is now added to nums1
//             m++;
//         }
//     }
// }