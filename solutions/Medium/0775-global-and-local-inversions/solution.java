// ──────────────────────────────────────────────────
// Problem  : 775. Global and Local Inversions
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/global-and-local-inversions/
// Runtime  : 2 ms (beats 31%)
// Memory   : 65356000 (beats 66%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
}
