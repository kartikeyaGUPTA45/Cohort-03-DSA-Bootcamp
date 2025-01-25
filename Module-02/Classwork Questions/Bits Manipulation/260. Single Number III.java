class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;

        for(int i=0;i<nums.length;i++) {
            temp ^= nums[i];
        }

        int setBit = (temp&(-temp));

        int ans [] = new int[2];

        for(int i=0;i<nums.length;i++) {
            if ((nums[i]&setBit) == 0) {
                ans[0] ^= nums[i];
            } else {
                ans[1] ^= nums[i];
            }
        }

        return ans;
    }
}
