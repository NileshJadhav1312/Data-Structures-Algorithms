class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; // pointer for a
        int j = b.length() - 1; // pointer for b
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i) - '0'; // convert char to int
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum % 2); // current bit
            carry = sum / 2;    // update carry

            i--;
            j--;
        }

        if (carry != 0) sb.append(carry); // add remaining carry

        return sb.reverse().toString(); // reverse to get final result
    }
}
