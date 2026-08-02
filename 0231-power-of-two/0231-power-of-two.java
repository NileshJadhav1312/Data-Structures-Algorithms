class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        return division(n);
    }

    boolean division(int n) {

        if (n == 1)
            return true;

        if (n % 2 != 0)
            return false;

        return division(n / 2);
    }
}