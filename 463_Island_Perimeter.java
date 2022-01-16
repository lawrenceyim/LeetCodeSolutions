class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (is_land(grid[i][j])) {
                    perimeter += get_sea_border(grid, i, j);
                }
            }
        }
        return perimeter;
    }
    
    public boolean is_land(int cell) {
        return cell == 1;
    }
                    
    public int get_sea_border(int[][] grid, int row, int column) {
        int sides = 0;
        // Check left of the cell
        try {
            if (grid[row][column - 1] == 0) sides++;
        } catch (Exception e) { sides++; }
        // Check right of the cell
        try {
            if (grid[row][column + 1] == 0) sides++;
        } catch (Exception e) { sides++; }
        // Check above the cell
        try {
            if (grid[row + 1][column] == 0) sides++;
        } catch (Exception e) { sides++; }
        // Check below the cell
        try {
            if (grid[row - 1][column] == 0) sides++;
        } catch (Exception e) { sides++; }
        return sides;
    }
}