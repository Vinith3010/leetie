// ──────────────────────────────────────────────────
// Problem  : 672. Bulb Switcher II
// Difficulty: Medium
// Tags     : Math, Bit Manipulation, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/bulb-switcher-ii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41988000 (beats 81%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int flipLights(int n, int m) {
        if (m == 0) return 1;
        if (n == 1) return m == 1 ? 2 : 2;
        if (n == 2) {
            if (m == 1) return 3;
            else return 4;
        }
        if (m == 1) return 4;
        if (m == 2) return 7;
        return 8;
    }
}
