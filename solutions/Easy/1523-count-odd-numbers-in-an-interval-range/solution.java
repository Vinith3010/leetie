// ──────────────────────────────────────────────────
// Problem  : 1523. Count Odd Numbers in an Interval Range
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41884000 (beats 90%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        return count;
    }
}
