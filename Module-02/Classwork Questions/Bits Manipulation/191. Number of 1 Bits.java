Solution-01: 

class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        
        while( n > 0) {
            ans++;
            n = (n&(n-1));
        }

        return ans;
    }
}


Solution-02: 

class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        for(int i=0;i<32;i++) {
            if ((n&(1<<i)) > 0) {
                ans++;
            } 
        }

        return ans;
    }
}
