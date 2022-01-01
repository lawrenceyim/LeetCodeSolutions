public class Solution {
    public int[] CountPoints(int[][] points, int[][] queries) {
        int[] counted = new int[queries.Length];
        for (int circle = 0; circle < queries.Length; circle++) {
            int count = 0;
            for (int point = 0; point < points.Length; point++) {
                if (inside(queries[circle][0], queries[circle][1],
                    queries[circle][2], points[point][0], points[point][1])) {
                    count++;
                }
            }
            counted[circle] = count;
        }
        return counted;
    }
    
    public static bool inside(int circle_x, int circle_y, int radius,
                             int point_x, int point_y) {
        int distance_x = Math.Abs(circle_x - point_x);
        int distance_y = Math.Abs(circle_y - point_y);
        double distance = Math.Sqrt(Math.Pow(distance_x, 2) + Math.Pow(distance_y,2));
        return (distance <= radius);
    }
}