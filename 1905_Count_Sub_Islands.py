class Solution:
    def bfs(self, cell):
        queue = [cell]
        subisland = True
        while queue:
            r, c = queue.pop(0)
            if r >= len(self.grid1) or c >= len(self.grid1[0]) or self.grid1[r][c] == 0:
                subisland = False
            if r < len(self.grid2) - 1 and (r + 1, c) not in self.seen:
                self.seen.add((r + 1, c))
                if self.grid2[r + 1][c] == 1:
                    queue.append((r + 1, c))
            if r > 0 and (r - 1, c) not in self.seen:
                self.seen.add((r - 1, c))
                if self.grid2[r - 1][c] == 1: 
                    queue.append((r - 1, c))
            if c < len(self.grid2[r]) - 1 and (r, c + 1) not in self.seen:
                self.seen.add((r, c + 1))
                if self.grid2[r][c + 1] == 1:
                    queue.append((r, c + 1))
            if c > 0 and (r, c - 1) not in self.seen:
                self.seen.add((r, c - 1))
                if self.grid2[r][c - 1] == 1: 
                    queue.append((r, c - 1))
        return 1 if subisland else 0 
    
    def countSubIslands(self, grid1: List[List[int]], grid2: List[List[int]]) -> int:
        self.grid1 = grid1
        self.grid2 = grid2
        self.seen = set()
        subislands = 0
        for i in range(len(grid2)):
            for j in range(len(grid2[i])):
                if (i, j) not in self.seen:
                    self.seen.add((i, j))
                    if grid2[i][j] == 1: 
                        subislands += self.bfs((i, j))
        return subislands