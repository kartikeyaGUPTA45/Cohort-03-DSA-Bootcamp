class Solution {
    public int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        int oneStep = climbStairs(n-1);
        int twoStep = climbStairs(n-2);

        return oneStep + twoStep;
    }
}
