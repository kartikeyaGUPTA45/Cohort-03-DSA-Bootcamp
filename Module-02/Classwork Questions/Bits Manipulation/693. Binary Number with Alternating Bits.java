class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevBit = (n&1);

        while (n != 0) {
            n>>=1;

            if (prevBit == (n&1)) {
                return false;
            }

            prevBit = (n&1);
        }

        return true;
    }
}
