import java.util.PriorityQueue;

class Solution {
    public int connectSticks(int[] sticks) {
        if (sticks.length <= 1) return 0;
        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < sticks.length; i++) {
            queue.add(sticks[i]);
        }
        while (queue.size() > 1) {
            int value = queue.poll();
            value += queue.poll();
            sum += value;
            queue.add(value);
        }
        return sum;
    }
}