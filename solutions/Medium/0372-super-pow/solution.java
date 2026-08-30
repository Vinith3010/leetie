// ──────────────────────────────────────────────────
// Problem  : 372. Super Pow
// Difficulty: Medium
// Tags     : Math, Divide and Conquer, Euler's Totient Function, Euler's Theorem
// Link     : https://leetcode.com/problems/super-pow/
// Runtime  : 4 ms (beats 77%)
// Memory   : 46220000 (beats 68%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static final int MOD = 1337;

    // Fast modular exponentiation
    private int powMod(int a, int k) {
        int result = 1;
        a %= MOD;
        while (k > 0) {
            if ((k & 1) == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            k >>= 1;
        }
        return result;
    }

    public int superPow(int a, int[] b) {
        int result = 1;
        for (int digit : b) {
            result = (powMod(result, 10) * powMod(a, digit)) % MOD;
        }
        return result;
    }
}
