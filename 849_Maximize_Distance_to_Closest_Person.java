import java.lang.Math; 

class Solution {
    public int maxDistToClosest(int[] seats) {
        double max = 0; 
        int count = 0;
        int edge = 0;
        boolean first_occupied = false;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                count++;
            } else {
                if (!first_occupied) {
                    edge = count;
                    count = 0;
                } else if  (count > max) {
                    max = count;
                    count = 0;
                } else {
                    count = 0;
                }
                first_occupied = true;
            }
        }
        if (count > 0) edge = Math.max(edge, count);
        return Math.max(edge, (int) Math.ceil(max / 2));
    }
}