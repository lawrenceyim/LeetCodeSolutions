public class Solution {
    public bool AsteroidsDestroyed(int mass, int[] asteroids) {
        ulong earth = (ulong) mass;
        Array.Sort(asteroids);
        for (int asteroid = 0; asteroid < asteroids.Length; asteroid++) {
            if (earth >= (ulong) asteroids[asteroid]) {
                earth += (ulong) asteroids[asteroid];
            }
            else return false;
        }
        return true;
    }
}