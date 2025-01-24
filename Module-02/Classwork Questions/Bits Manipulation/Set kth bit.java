Problem Link: https://www.geeksforgeeks.org/problems/set-kth-bit3724/1


Solution: 
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        // 1010
        // 1110 = 14
        return (n|(1<<k)); 
    }
}
