import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        Map<String, Integer> wordMap = new HashMap<>();
        for (String w : words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }

        // Try all offsets (important trick)
        for (int i = 0; i < wordLen; i++) {

            int left = i;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (wordMap.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    //  shrink window if frequency exceeds
                    while (seen.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    //  valid window
                    if (count == totalWords) {
                        result.add(left);
                    }

                } else {
                    //  reset window
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }
}
//-----------------------working code but time com is more --------
// import java.util.*;

// public class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
//         List<Integer> result = new ArrayList<>();

//         int wordLen = words[0].length();
//         int totalWords = words.length;
//         int totalLen = wordLen * totalWords;

//         for (int i = 0; i <= s.length() - totalLen; i++) {

//             // dummy array (0 = not used, 1 = used)
//             int[] used = new int[totalWords];

//             int j = i;
//             int count = 0;

//             while (count < totalWords) {
//                 String sub = s.substring(j, j + wordLen);

//                 boolean found = false;

//                 // check in words array
//                 for (int k = 0; k < totalWords; k++) {
//                     if (used[k] == 0 && words[k].equals(sub)) {
//                         used[k] = 1;  // mark as used
//                         found = true;
//                         break;
//                     }
//                 }

//                 // if no match → break
//                 if (!found) {
//                     break;
//                 }

//                 j += wordLen;
//                 count++;
//             }

//             // check if all words used
//             if (count == totalWords) {
//                 result.add(i);
//             }
//         }

//         return result;
//     }
// }