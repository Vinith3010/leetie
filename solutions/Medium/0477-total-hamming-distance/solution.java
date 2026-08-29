// ──────────────────────────────────────────────────
// Problem  : 477. Total Hamming Distance
// Difficulty: Medium
// Tags     : Array, Math, Bit Manipulation
// Link     : https://leetcode.com/problems/total-hamming-distance/
// Runtime  : 16 ms (beats 43%)
// Memory   : 48108000 (beats 35%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        int n = nums.length;
        
        // For each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int num : nums) {
                if ((num >> i & 1) == 1) {
                    ones++;
                }
            }
            int zeros = n - ones;
            total += ones * zeros;
        }
        
        return total;
    }
}
