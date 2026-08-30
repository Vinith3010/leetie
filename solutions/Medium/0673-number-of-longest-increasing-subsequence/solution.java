// ──────────────────────────────────────────────────
// Problem  : 673. Number of Longest Increasing Subsequence
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Binary Indexed Tree, Segment Tree, Longest Increasing Subsequence
// Link     : https://leetcode.com/problems/number-of-longest-increasing-subsequence/
// Runtime  : 19 ms (beats 76%)
// Memory   : 45724000 (beats 14%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] length = new int[n];
        int[] count = new int[n];
        Arrays.fill(length, 1);
        Arrays.fill(count, 1);

        int maxLen = 1, result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    } else if (length[j] + 1 == length[i]) {
                        count[i] += count[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, length[i]);
        }

        for (int i = 0; i < n; i++) {
            if (length[i] == maxLen) result += count[i];
        }
        return result;
    }
}
