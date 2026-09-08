// ──────────────────────────────────────────────────
// Problem  : 779. K-th Symbol in Grammar
// Difficulty: Medium
// Tags     : Math, Bit Manipulation, Recursion
// Link     : https://leetcode.com/problems/k-th-symbol-in-grammar/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42060000 (beats 58%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) return 0;
        int parent = kthGrammar(n - 1, (k + 1) / 2);
        boolean isEven = (k % 2 == 0);
        if (parent == 0) {
            return isEven ? 1 : 0;
        } else {
            return isEven ? 0 : 1;
        }
    }
}
