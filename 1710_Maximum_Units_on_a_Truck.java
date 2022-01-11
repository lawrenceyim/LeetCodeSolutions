import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));
        int spaceRemaining = truckSize;
        int sum = 0;
        for (int i = boxTypes.length - 1; i >= 0; i--) {
            if (spaceRemaining >= boxTypes[i][0]) {
                sum += boxTypes[i][0] * boxTypes[i][1];
                spaceRemaining -= boxTypes[i][0];
            } else {
                sum += spaceRemaining * boxTypes[i][1];
                spaceRemaining = 0;
            }
            if (spaceRemaining == 0) break;
        }
        return sum;
    }
}