class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int pXOR [] = new int[n];
        pXOR[0] = arr[0];

        for(int i=1;i<n;i++) {
            pXOR[i] = pXOR[i-1] ^ arr[i];
        }

        int ans [] = new int [queries.length];
        for(int i=0;i<queries.length;i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left == 0) {
                ans[i] = pXOR[right];
            } else {
                ans[i] = pXOR[left-1] ^ pXOR[right];
            }
        }

        return ans;

    }
}
