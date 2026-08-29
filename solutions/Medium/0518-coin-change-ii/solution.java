// ──────────────────────────────────────────────────
// Problem  : 518. Coin Change II
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Knapsack Problem, Complete Knapsack
// Link     : https://leetcode.com/problems/coin-change-ii/
// Runtime  : 5 ms (beats 100%)
// Memory   : 43184000 (beats 72%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // one way to make amount 0
        
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }
}
