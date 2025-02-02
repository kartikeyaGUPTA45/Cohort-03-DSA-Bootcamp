Problem Link: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

Code:
static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i=0,j=0,sum=0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(i<arr.length) {
            sum += arr[i];
            
            while(sum > target) {
                sum -= arr[j];
                j++;
            }
            
            if (sum == target) {
                ans.add(j+1);
                ans.add(i+1);
                
                return ans;
            }
            
            i++;
        }
        
        ans.add(-1);
        return ans;
    }
