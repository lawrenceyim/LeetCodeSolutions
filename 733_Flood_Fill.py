class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        seen = set()
        colors = set()
        seen.add((sr, sc))
        colors.add((sr, sc))
        queue = [(sr, sc)]
        while queue:
            r, c = queue.pop(0)
            if r < len(image) - 1 and (r + 1, c) not in seen:
                if image[sr][sc] == image[r + 1][c]:
                    queue.append((r + 1, c))
                    colors.add((r + 1, c))
                seen.add((r + 1, c))
            if r > 0 and (r - 1, c) not in seen:
                if image[sr][sc] == image[r - 1][c]:
                    queue.append((r - 1, c))
                    colors.add((r - 1, c))
                seen.add((r - 1, c))
            if c < len(image[r]) - 1 and (r, c + 1) not in seen:
                if image[sr][sc] == image[r][c + 1]:
                    queue.append((r, c + 1))
                    colors.add((r, c + 1))
                seen.add((r, c + 1))
            if c > 0 and (r, c - 1) not in seen:
                if image[sr][sc] == image[r][c - 1]:
                    queue.append((r, c - 1))
                    colors.add((r, c - 1))
                seen.add((r, c - 1))
        for color in colors:
            a, b = color
            image[a][b] = newColor
        return image
    