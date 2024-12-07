class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = 
            new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++) {
            pq.add(stones[i]);
        }    


        while(pq.size()>1) {
            int y = pq.poll();
            int x = pq.poll();

            if (y != x) {
                pq.add(y-x);
            }
        }

        return pq.size() == 0 ? 0: pq.peek();
    }
}
