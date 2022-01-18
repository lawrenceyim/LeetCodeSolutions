class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plantable = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = true;
            boolean right = true;
            if (flowerbed[i] == 0) {
                try {
                    if (flowerbed[i - 1] == 1) left = false;
                } catch (Exception e) { }
                try {
                    if (flowerbed[i + 1] == 1) right = false;
                } catch (Exception e) { }
                if (left && right) {
                    flowerbed[i] = 1;
                    plantable++;
                }
            }
        }
        return (plantable >= n);
    }
}