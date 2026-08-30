// ──────────────────────────────────────────────────
// Problem  : 633. Sum of Square Numbers
// Difficulty: Medium
// Tags     : Math, Two Pointers, Binary Search
// Link     : https://leetcode.com/problems/sum-of-square-numbers/
// Runtime  : 3 ms (beats 98%)
// Memory   : 42308000 (beats 15%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0, b = (long)Math.sqrt(c);
        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c) return true;
            if (sum < c) a++;
            else b--;
        }
        return false;
    }
}
