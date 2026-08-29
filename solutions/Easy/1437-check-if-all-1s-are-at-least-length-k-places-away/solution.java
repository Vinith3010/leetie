// ──────────────────────────────────────────────────
// Problem  : 1437. Check If All 1's Are at Least Length K Places Away
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
// Runtime  : 1 ms (beats 100%)
// Memory   : 65660000 (beats 29%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1; // index of last 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prev != -1 && i - prev - 1 < k) {
                    return false;
                }
                prev = i;
            }
        }
        return true;
    }
}
