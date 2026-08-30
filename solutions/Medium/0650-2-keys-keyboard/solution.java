// ──────────────────────────────────────────────────
// Problem  : 650. 2 Keys Keyboard
// Difficulty: Medium
// Tags     : Math, Dynamic Programming
// Link     : https://leetcode.com/problems/2-keys-keyboard/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42320000 (beats 38%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minSteps(int n) {
        int steps = 0;
        for (int factor = 2; factor <= n; factor++) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
        }
        return steps;
    }
}
