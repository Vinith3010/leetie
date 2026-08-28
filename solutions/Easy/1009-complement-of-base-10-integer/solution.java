// ──────────────────────────────────────────────────
// Problem  : 1009. Complement of Base 10 Integer
// Difficulty: Easy
// Tags     : Bit Manipulation
// Link     : https://leetcode.com/problems/complement-of-base-10-integer/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42332000 (beats 18%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        
        int mask = 1;
        while (mask <= n) {
            mask <<= 1;
        }
        
        return (mask - 1) ^ n;
    }
}
