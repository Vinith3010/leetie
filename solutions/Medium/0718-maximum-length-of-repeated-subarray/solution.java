// ──────────────────────────────────────────────────
// Problem  : 718. Maximum Length of Repeated Subarray
// Difficulty: Medium
// Tags     : Array, Binary Search, Dynamic Programming, Sliding Window, Rolling Hash, Hash Function
// Link     : https://leetcode.com/problems/maximum-length-of-repeated-subarray/
// Runtime  : 23 ms (beats 90%)
// Memory   : 66444000 (beats 26%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen;
    }
}
