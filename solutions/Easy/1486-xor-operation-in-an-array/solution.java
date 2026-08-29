// ──────────────────────────────────────────────────
// Problem  : 1486. XOR Operation in an Array
// Difficulty: Easy
// Tags     : Math, Bit Manipulation
// Link     : https://leetcode.com/problems/xor-operation-in-an-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41984000 (beats 75%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= (start + 2 * i);
        }
        return result;
    }
}
