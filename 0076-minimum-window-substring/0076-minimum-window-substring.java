
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        int[] freq = new int[256];

        // Store frequency of characters in t
        for (char c : t.toCharArray())
         {
            freq[c]++;
        }

        int left = 0;
        int count = t.length();   // how much length we need
        int minLen = Integer.MAX_VALUE;
        int start = 0;            // starting index of result

        for (int right = 0; right < s.length(); right++) 
        {

            // If this char is needed, decrease count
            if (freq[s.charAt(right)] > 0) 
            {
                count--;
            }

            freq[s.charAt(right)]--;

            // When we found valid window
            while (count == 0) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Try to shrink window
                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

// class Solution {

//     public String minWindow(String s, String t) {

//         int minLength = Integer.MAX_VALUE;
//         int left = 0;
//         String answer = "";

//         for (int right = 1; right <= s.length(); right++) 
//         {

//             String str = s.substring(left, right);

//             while (containsAllCharacters(str, t)) 
//             {

//                 if (str.length() < minLength) 
//                 {
//                     minLength = str.length();
//                     answer = str;
//                 }

//                 left++;
//                 if (left >= right) break;

//                 str = s.substring(left, right);
//             }
//         }

//         return answer;
//     }

//     public static boolean containsAllCharacters(String s1, String s2) {
//         if (s2.length() > s1.length()) return false;

//         int[] freq = new int[256];

//         for (int i = 0; i < s1.length(); i++) {
//             freq[s1.charAt(i)]++;
//         }

//         for (int i = 0; i < s2.length(); i++) {
//             char ch = s2.charAt(i);

//             if (freq[ch] == 0) {
//                 return false;
//             }

//             freq[ch]--;
//         }

//         return true;
//     }
// }