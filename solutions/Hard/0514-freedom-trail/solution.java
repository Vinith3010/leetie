// ──────────────────────────────────────────────────
// Problem  : 514. Freedom Trail
// Difficulty: Hard
// Tags     : String, Dynamic Programming, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/freedom-trail/
// Runtime  : 13 ms (beats 39%)
// Memory   : 46384000 (beats 75%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findRotateSteps(String ring, String key) {
        int m = ring.length(), n = key.length();
        int[][] dp = new int[n + 1][m];
        
        // Initialize with large values
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        
        for (int i = 1; i <= n; i++) {
            char target = key.charAt(i - 1);
            for (int j = 0; j < m; j++) {
                if (ring.charAt(j) == target) {
                    for (int k = 0; k < m; k++) {
                        if (dp[i - 1][k] < Integer.MAX_VALUE / 2) {
                            int dist = Math.min(Math.abs(j - k), m - Math.abs(j - k));
                            dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + dist + 1);
                        }
                    }
                }
            }
        }
        
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, dp[n][j]);
        }
        return ans;
    }
}
