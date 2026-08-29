// ──────────────────────────────────────────────────
// Problem  : 517. Super Washing Machines
// Difficulty: Hard
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/super-washing-machines/
// Runtime  : 1 ms (beats 99%)
// Memory   : 46484000 (beats 85%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findMinMoves(int[] machines) {
        int total = 0;
        for (int m : machines) total += m;
        
        int n = machines.length;
        if (total % n != 0) return -1; // impossible
        
        int target = total / n;
        int res = 0, balance = 0;
        
        for (int m : machines) {
            int diff = m - target;
            balance += diff;
            res = Math.max(res, Math.max(Math.abs(balance), diff));
        }
        return res;
    }
}
