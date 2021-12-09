class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List kids = new ArrayList();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                kids.add(true);
            } else {
                kids.add(false);
            }
        }
        return kids;
    }
}
