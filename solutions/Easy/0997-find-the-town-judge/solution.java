// ──────────────────────────────────────────────────
// Problem  : 997. Find the Town Judge
// Difficulty: Easy
// Tags     : Array, Hash Table, Graph Theory
// Link     : https://leetcode.com/problems/find-the-town-judge/
// Runtime  : 2 ms (beats 100%)
// Memory   : 53840000 (beats 19%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];
        
        for (int[] t : trust) {
            score[t[0]]--; // person trusts someone → decrease
            score[t[1]]++; // person is trusted → increase
        }
        
        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i; // judge found
            }
        }
        
        return -1; // no judge
    }
}
