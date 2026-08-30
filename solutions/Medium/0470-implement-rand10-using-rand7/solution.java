// ──────────────────────────────────────────────────
// Problem  : 470. Implement Rand10() Using Rand7()
// Difficulty: Medium
// Tags     : Math, Rejection Sampling, Randomized, Probability and Statistics
// Link     : https://leetcode.com/problems/implement-rand10-using-rand7/
// Runtime  : 5 ms (beats 98%)
// Memory   : 51960000 (beats 10%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution extends SolBase {
    public int rand10() {
        while (true) {
            int num = (rand7() - 1) * 7 + rand7(); // range 1–49
            if (num <= 40) {
                return (num - 1) % 10 + 1;
            }
        }
    }
}
