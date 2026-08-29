// ──────────────────────────────────────────────────
// Problem  : 498. Diagonal Traverse
// Difficulty: Medium
// Tags     : Array, Matrix, Simulation
// Link     : https://leetcode.com/problems/diagonal-traverse/
// Runtime  : 3 ms (beats 71%)
// Memory   : 48264000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, dir = 1; // dir=1 means up-right, dir=-1 means down-left
        
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            
            // Move in current direction
            if (dir == 1) { // up-right
                if (col == n - 1) { row++; dir = -1; }
                else if (row == 0) { col++; dir = -1; }
                else { row--; col++; }
            } else { // down-left
                if (row == m - 1) { col++; dir = 1; }
                else if (col == 0) { row++; dir = 1; }
                else { row++; col--; }
            }
        }
        return result;
    }
}
