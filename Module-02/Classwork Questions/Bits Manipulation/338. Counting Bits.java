class Solution {

    public int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n&(n-1));
        }

        return count;
    }

    public int[] countBits(int n) {
        int ans [] = new int[n+1];

        ans[0] = 0;
        for(int i=1;i<=n;i++) {
            ans[i] = countSetBits(i);
        }

        return ans;
    }
}
