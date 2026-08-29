// ──────────────────────────────────────────────────
// Problem  : 458. Poor Pigs
// Difficulty: Hard
// Tags     : Math, Dynamic Programming, Combinatorics
// Link     : https://leetcode.com/problems/poor-pigs/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42068000 (beats 50%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // Number of tests we can perform
        int tests = minutesToTest / minutesToDie;
        
        // Each pig gives (tests + 1) possible states
        int pigs = 0;
        while (Math.pow(tests + 1, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}
