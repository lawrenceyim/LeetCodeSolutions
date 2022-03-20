class Solution {
    public int countCollisions(String directions) {
        int collisions = 0;
        char[] dir = directions.toCharArray();
        for (int i = 0; i < dir.length - 1; i++) {
            if (dir[i] == 'R' && dir[i + 1] == 'L') {
                dir[i] = 'S';
                dir[i + 1] = 'S';
                collisions += 2;
            }
            else if (dir[i] == 'R' && dir[i + 1] == 'S') {
                dir[i] = 'S';
                collisions += 1;
            } else if (dir[i] == 'S' && dir[i + 1] == 'L') {
                dir[i + 1] = 'S';
                collisions += 1;
            }
        }
        Integer first = null;
        Integer last = null;
        for (int i = 0; i < dir.length; i++) {
            if (dir[i] == 'S') {
                first = i;
                for (int j = dir.length - 1; j >= first; j--) {
                    if (dir[j] == 'S') {
                        last = j;
                        break;
                    }
                }
                break;
            }
        }
        if (first == null) return collisions;
        if (first != last) {
            for (int i = 0; i < first; i++) {
                if (dir[i] == 'R') collisions++;
            }
            for (int i = last + 1; i < dir.length; i++) {
                if (dir[i] == 'L') collisions++;
            }
            for (int i = first + 1; i < last; i++) {
                if (dir[i] != 'S') {
                    collisions++;
                }
            }
        }
        return collisions;
    }
}