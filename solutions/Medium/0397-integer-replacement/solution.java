// ──────────────────────────────────────────────────
// Problem  : 397. Integer Replacement
// Difficulty: Medium
// Tags     : Dynamic Programming, Greedy, Bit Manipulation, Memoization
// Link     : https://leetcode.com/problems/integer-replacement/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42172000 (beats 44%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int integerReplacement(int n) {
        long num = n; // use long to avoid overflow
        int steps = 0;

        while (num != 1) {
            if ((num & 1) == 0) {
                num >>= 1; // divide by 2
            } else {
                if (num == 3 || ((num & 2) == 0)) {
                    num--;
                } else {
                    num++;
                }
            }
            steps++;
        }
        return steps;
    }
}
