class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] newarr = mergeSortedArrays(nums1, nums2);
        int n = newarr.length;

        if (n % 2 == 1) {
            int mid = n / 2;
            return newarr[mid]; // correct index
        } else {
            int r = n / 2;
            return (newarr[r] + newarr[r - 1]) / 2.0; // fix division
        }
    }

    public int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < n) {
            merged[k++] = nums1[i++];
        }

        while (j < m) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
}