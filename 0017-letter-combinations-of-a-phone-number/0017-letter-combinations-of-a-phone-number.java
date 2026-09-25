class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] arr = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        generate(digits, 0, "", result, arr);

        return result;
    }

    static void generate(String digits, int index,String current,List<String> result,String[] arr)
     {
        // Base case
        if (index == digits.length()) 
        {
            result.add(current);
            return;
        }

        // Convert current digit character to number
        int num = digits.charAt(index) - '0';

        // Get corresponding letters
        String letters = arr[num];

        // Try every letter
        for (char ch : letters.toCharArray()) {
            generate(digits,index + 1,current + ch,result,arr);
        }
    }
}