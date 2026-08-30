// ──────────────────────────────────────────────────
// Problem  : 375. Guess Number Higher or Lower II
// Difficulty: Medium
// Tags     : Math, Dynamic Programming, Minimax, Game Theory
// Link     : https://leetcode.com/problems/guess-number-higher-or-lower-ii/
// Runtime  : 18 ms (beats 81%)
// Memory   : 43384000 (beats 50%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 2][n + 2];

        for (int len = 2; len <= n; len++) {
            for (int start = 1; start + len - 1 <= n; start++) {
                int end = start + len - 1;
                dp[start][end] = Integer.MAX_VALUE;
                for (int k = start; k <= end; k++) {
                    int cost = k + Math.max(dp[start][k - 1], dp[k + 1][end]);
                    dp[start][end] = Math.min(dp[start][end], cost);
                }
            }
        }
        return dp[1][n];
    }
}
