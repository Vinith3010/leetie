// ──────────────────────────────────────────────────
// Problem  : 59. Spiral Matrix II
// Difficulty: Medium
// Tags     : Array, Matrix, Simulation
// Link     : https://leetcode.com/problems/spiral-matrix-ii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42944000 (beats 45%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] generateMatrix(int n) {
        int x = 0, y = 0, dx = 1, dy = 0;
        int[][] res = new int[n][n];

        for (int i = 0; i < n * n; i++) {
            res[y][x] = i + 1;

            if (!(0 <= x + dx && x + dx < n && 0 <= y + dy && y + dy < n && res[y+dy][x+dx] == 0)) {
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            
            x += dx;
            y += dy;
        }

        return res;        
    }
}