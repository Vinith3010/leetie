// ──────────────────────────────────────────────────
// Problem  : 754. Reach a Number
// Difficulty: Medium
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/reach-a-number/
// Runtime  : 2 ms (beats 70%)
// Memory   : 42264000 (beats 23%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target); // symmetry
        int sum = 0, steps = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps;
        }
        return steps;
    }
}
