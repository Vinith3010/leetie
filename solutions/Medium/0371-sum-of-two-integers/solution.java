// ──────────────────────────────────────────────────
// Problem  : 371. Sum of Two Integers
// Difficulty: Medium
// Tags     : Math, Bit Manipulation
// Link     : https://leetcode.com/problems/sum-of-two-integers/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42000000 (beats 69%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            // carry contains common set bits of a and b
            int carry = (a & b) << 1;

            // sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;

            // assign carry to b, so we can add it in the next iteration
            b = carry;
        }
        return a;
    }
}
