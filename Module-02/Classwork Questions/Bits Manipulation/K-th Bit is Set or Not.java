Problem Link: https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


solution 

static boolean checkKthBit(int n, int k) {
        // return ((n&(1<<k)) > 0); // Left Shift Operator
        return (((n>>k)&1) == 1); // Right shift Operator
}
