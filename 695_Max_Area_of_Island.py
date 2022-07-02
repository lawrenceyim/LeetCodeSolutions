class Solution:
    seen = None
    grid = None
    def bfs(self, cell):
        largest = 0
        self.seen.add(cell)
        queue = [cell]
        while queue:
            largest += 1
            r, c = queue.pop(0)
            if r < (len(self.grid) - 1) and self.grid[r + 1][c] == 1 and (r + 1, c) not in self.seen:
                self.seen.add((r + 1, c))
                queue.append((r + 1, c))
            if r > 0 and self.grid[r - 1][c] == 1 and (r - 1, c) not in self.seen:
                self.seen.add((r - 1, c))
                queue.append((r - 1, c))
            if c < (len(self.grid[r]) - 1) and self.grid[r][c + 1] == 1 and (r, c + 1) not in self.seen:
                self.seen.add((r, c + 1))
                queue.append((r, c + 1))
            if c > 0 and self.grid[r][c - 1] == 1 and (r, c - 1) not in self.seen:
                self.seen.add((r, c - 1))
                queue.append((r, c - 1))
        return largest
    
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        largest = 0
        self.seen = set()
        self.grid = grid
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == 1 and (i, j) not in self.seen:
                    largest = max(largest, self.bfs((i, j)))
        return largest