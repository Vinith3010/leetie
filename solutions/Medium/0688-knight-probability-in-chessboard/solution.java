// ──────────────────────────────────────────────────
// Problem  : 688. Knight Probability in Chessboard
// Difficulty: Medium
// Tags     : Dynamic Programming
// Link     : https://leetcode.com/problems/knight-probability-in-chessboard/
// Runtime  : 7 ms (beats 40%)
// Memory   : 46340000 (beats 76%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static final int[][] moves = {
        {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
        {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[k + 1][n][n];

        // Base case: probability = 1 when no moves
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[0][i][j] = 1.0;
            }
        }

        // Fill DP table
        for (int m = 1; m <= k; m++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double prob = 0.0;
                    for (int[] move : moves) {
                        int ni = i + move[0];
                        int nj = j + move[1];
                        if (ni >= 0 && nj >= 0 && ni < n && nj < n) {
                            prob += dp[m - 1][ni][nj] / 8.0;
                        }
                    }
                    dp[m][i][j] = prob;
                }
            }
        }

        return dp[k][row][column];
    }
}
