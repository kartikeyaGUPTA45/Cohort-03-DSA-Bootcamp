Problem Statement: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int ans = 0,sum = 0, i= 0,j=0;
        
        while(i<k) {
            sum += arr[i];
            i++;
        }
        
        ans = Math.max(ans, sum);
        
        while(i < arr.length) {
            sum += arr[i];
            sum -= arr[j];
            
            ans = Math.max(ans, sum);
            
            i++;
            j++;
        }
        
        return ans;
    }
}
