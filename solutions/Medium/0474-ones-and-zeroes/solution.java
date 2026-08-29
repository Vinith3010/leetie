// ──────────────────────────────────────────────────
// Problem  : 474. Ones and Zeroes
// Difficulty: Medium
// Tags     : Array, String, Dynamic Programming, Knapsack Problem, 0-1 Knapsack
// Link     : https://leetcode.com/problems/ones-and-zeroes/
// Runtime  : 19 ms (beats 91%)
// Memory   : 43612000 (beats 79%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j] = max number of strings with i zeros and j ones
        int[][] dp = new int[m + 1][n + 1];
        
        for (String s : strs) {
            int zeros = 0, ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }
            
            // Traverse backwards to avoid reuse
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeros][j - ones]);
                }
            }
        }
        
        return dp[m][n];
    }
}
