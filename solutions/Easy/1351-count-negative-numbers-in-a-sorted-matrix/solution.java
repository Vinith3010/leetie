// ──────────────────────────────────────────────────
// Problem  : 1351. Count Negative Numbers in a Sorted Matrix
// Difficulty: Easy
// Tags     : Array, Binary Search, Matrix
// Link     : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47000000 (beats 44%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        int row = m - 1, col = 0;

        // Start from bottom-left corner
        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                // All elements to the right are also negative
                count += (n - col);
                row--;
            } else {
                col++;
            }
        }
        return count;
    }
}
