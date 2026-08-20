class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stone : stones) {
            minHeap.offer(-stone);
        }
        while(!minHeap.isEmpty()) {
            if(minHeap.size() == 1) return -1 * minHeap.peek();
            int x = minHeap.poll();
            int y = minHeap.poll();
            if(x < y) {
                minHeap.offer(x - y);
            } else {
                minHeap.offer(y - x);
            }
        }
        return 0;
        
    }
}
