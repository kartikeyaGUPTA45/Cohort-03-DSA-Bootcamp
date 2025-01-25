class Solution {

    public int countBits(int n) {
        int ans = 0;

        while(n > 0) {
            ans++;
            n = (n&(n-1));
        }

        return ans;
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for(int i=2;i*i<=n;i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i=left;i<=right;i++) {
            int countSetBits = countBits(i);
            if (isPrime(countSetBits) == true) ans++;
        }

        return ans;

    }
}
