// ──────────────────────────────────────────────────
// Problem  : 516. Longest Palindromic Subsequence
// Difficulty: Medium
// Tags     : String, Dynamic Programming
// Link     : https://leetcode.com/problems/longest-palindromic-subsequence/
// Runtime  : 39 ms (beats 62%)
// Memory   : 64220000 (beats 21%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        
        // Base case: single characters are palindromes of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        
        // Fill DP table for substrings of increasing length
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + (len == 2 ? 0 : dp[i + 1][j - 1]);
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[0][n - 1];
    }
}
