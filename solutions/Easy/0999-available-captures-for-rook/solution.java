// ──────────────────────────────────────────────────
// Problem  : 999. Available Captures for Rook
// Difficulty: Easy
// Tags     : Array, Matrix, Simulation
// Link     : https://leetcode.com/problems/available-captures-for-rook/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42588000 (beats 78%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = -1, rookCol = -1;
        
        // Find the rook's position
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
        }
        
        int captures = 0;
        // Directions: up, down, left, right
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        
        for (int[] d : dirs) {
            int r = rookRow, c = rookCol;
            while (true) {
                r += d[0];
                c += d[1];
                if (r < 0 || r >= 8 || c < 0 || c >= 8) break; // out of bounds
                if (board[r][c] == 'B') break; // blocked by bishop
                if (board[r][c] == 'p') {
                    captures++;
                    break; // rook captures pawn, stop in this direction
                }
            }
        }
        
        return captures;
    }
}
