// ──────────────────────────────────────────────────
// Problem  : 1413. Minimum Value to Get Positive Step by Step Sum
// Difficulty: Easy
// Tags     : Array, Prefix Sum
// Link     : https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43000000 (beats 28%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;
        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }
        return 1 - minSum;
    }
}
