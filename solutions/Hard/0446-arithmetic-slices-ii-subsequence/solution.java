// ──────────────────────────────────────────────────
// Problem  : 446. Arithmetic Slices II - Subsequence
// Difficulty: Hard
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
// Runtime  : 189 ms (beats 22%)
// Memory   : 109808000 (beats 27%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        // Each index has a map: difference -> count of subsequences ending here
        Map<Long, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - (long) nums[j];
                // Count subsequences ending at j with this diff
                int countAtJ = dp[j].getOrDefault(diff, 0);
                // Extend those subsequences by nums[i]
                result += countAtJ;
                // Update dp[i]: new subsequences formed
                dp[i].put(diff, dp[i].getOrDefault(diff, 0) + countAtJ + 1);
            }
        }
        return (int) result;
    }
}
