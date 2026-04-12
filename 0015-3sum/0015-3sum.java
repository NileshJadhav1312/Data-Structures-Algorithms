
import java.util.*;

class Solution {

    public static List<List<Integer>> threeSum(int[] nums) 
    {

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
         {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) 
            {
                
                int third = -(nums[i] + nums[j]);

                if (seen.contains(third))
                 {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    result.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// class Solution {

//     public static List< List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> myList = new ArrayList<>();
//         Set<List<Integer>> check = new HashSet<>();

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 for (int k = 0; k < nums.length; k++) {
//                    if (i != j && i != k && j != k) 
//                    {
//                     if (nums[i] + nums[j] + nums[k] == 0) 
//                     {
//                         List<Integer> triplet = new ArrayList<>();
//                         triplet.add(nums[i]);
//                         triplet.add(nums[j]);
//                         triplet.add(nums[k]);
//                         Collections.sort(triplet);
//                         check.add(triplet);
//                     }

//                 }  
//                 }
//             }
//         }
//         return new ArrayList<>(check);
//     }

//     public static void main(String[] args) {
//         int arr[] = {-1, 0, 1, 2, -1, -4};
//         List<List<Integer>> res = threeSum(arr);
//         System.out.println(res);
//     }
// }