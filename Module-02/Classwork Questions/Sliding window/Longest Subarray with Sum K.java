Problem Link: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

Code:

public int longestSubarray(int[] arr, int k) {
        // code here
        int ans = 0, sum = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            
            if (sum == k) ans = i+1;
            
            int rem = sum - k;
            
            if (map.containsKey(rem)) {
                ans = Math.max(ans, i-map.get(rem));
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return ans;
    }
