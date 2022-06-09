class Solution:
    def dfs(self, grid, node, seen):
        r, c = node
        seen.add((r, c))
        if r < len(grid) - 1 and (r + 1, c) not in seen:
            if grid[r + 1][c] == '1':
                seen = self.dfs(grid, (r + 1, c), seen)
            seen.add((r + 1, c))
        if r > 0 and (r - 1, c) not in seen:
            if grid[r - 1][c] == '1':
                seen = self. dfs(grid, (r - 1, c), seen)
            seen.add((r - 1, c))
        if c < len(grid[r]) - 1 and (r, c + 1) not in seen:
            if grid[r][c + 1] == '1':
                seen = self.dfs(grid, (r, c + 1), seen)
            seen.add((r, c + 1))
        if c > 0 and (r, c - 1) not in seen:
            if grid[r][c - 1] == '1':
                seen = self.dfs(grid, (r, c - 1), seen)
            seen.add((r, c - 1))
        return seen
        
    
    def numIslands(self, grid: List[List[str]]) -> int:
        seen = set()
        islands = 0
        for i in range(0, len(grid)):
            for j in range(0, len(grid[i])):
                if (i, j) not in seen and grid[i][j] == "1":
                    islands += 1
                    seen = self.dfs(grid, (i, j), seen)
        return islands