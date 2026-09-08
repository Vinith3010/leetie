// ──────────────────────────────────────────────────
// Problem  : 764. Largest Plus Sign
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/largest-plus-sign/
// Runtime  : 25 ms (beats 80%)
// Memory   : 48352000 (beats 69%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for (int[] row : grid) Arrays.fill(row, n);

        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = 0, up = 0, down = 0;
            for (int j = 0, k = n - 1; j < n; j++, k--) {
                // Left to right
                left = (grid[i][j] == 0) ? 0 : left + 1;
                grid[i][j] = Math.min(grid[i][j], left);

                // Right to left
                right = (grid[i][k] == 0) ? 0 : right + 1;
                grid[i][k] = Math.min(grid[i][k], right);

                // Top to bottom
                up = (grid[j][i] == 0) ? 0 : up + 1;
                grid[j][i] = Math.min(grid[j][i], up);

                // Bottom to top
                down = (grid[k][i] == 0) ? 0 : down + 1;
                grid[k][i] = Math.min(grid[k][i], down);
            }
        }

        int res = 0;
        for (int[] row : grid) {
            for (int val : row) {
                res = Math.max(res, val);
            }
        }
        return res;
    }
}
