class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0, sum = 0;
        int i =0,j=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(i<k) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            sum +=nums[i];
            i++;
        }

        if (map.size() == k) {
            ans = Math.max(ans,sum);
        }

        while(i<nums.length) {
            sum -=nums[j];
            map.put(nums[j],map.get(nums[j])-1);

            if (map.get(nums[j]) == 0) {
                map.remove(nums[j]);
            }

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if  (map.size() == k) {
                ans = Math.max(ans, sum);
            }

            j++;
            i++;
        }

        return ans;


    }
}
