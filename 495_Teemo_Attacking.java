// First solution
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int duration_poisoned = duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] >= timeSeries[i] + duration) {
                duration_poisoned += duration;
            } else {
                duration_poisoned += timeSeries[i + 1] - timeSeries[i];                         
            }
        }
        return duration_poisoned;
    }
}

// Second solution
import java.lang.Math;

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int duration_poisoned = duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            duration_poisoned += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        return duration_poisoned;
    }
}