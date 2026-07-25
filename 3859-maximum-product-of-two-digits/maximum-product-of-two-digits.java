class Solution {
    public int maxProduct(int n) {
        n = Math.abs(n);
        int large = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            if (dig > large) {
                seclarge = large;
                large = dig;
            } else if (dig > seclarge) {
                seclarge = dig;
            }

        }
        return large * seclarge;
    }
}