class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> largeStones = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            largeStones.add(stones[i]);
        }
        while (largeStones.size() > 1) {
            int x = largeStones.poll();
            int y = largeStones.poll();
            int z = Math.abs(x - y);
            largeStones.add(z);
        }
        return largeStones.peek();
    }
}