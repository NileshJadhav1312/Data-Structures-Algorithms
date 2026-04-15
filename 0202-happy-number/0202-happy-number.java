import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; // cycle detected
            }
            seen.add(n);
            n = square(n);
        }

        return true;
    }

    int square(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }

        return sum;
    }
}