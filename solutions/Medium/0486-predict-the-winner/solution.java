// ──────────────────────────────────────────────────
// Problem  : 486. Predict the Winner
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming, Recursion, Minimax, Game Theory, Zero-Sum Game
// Link     : https://leetcode.com/problems/predict-the-winner/
// Runtime  : 1 ms (beats 35%)
// Memory   : 42752000 (beats 55%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        
        // Base case: single element
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        
        // Fill DP table for subarrays of length >= 2
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                int pickLeft = nums[i] - dp[i + 1][j];
                int pickRight = nums[j] - dp[i][j - 1];
                dp[i][j] = Math.max(pickLeft, pickRight);
            }
        }
        
        return dp[0][n - 1] >= 0;
    }
}
