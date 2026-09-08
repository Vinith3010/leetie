// ──────────────────────────────────────────────────
// Problem  : 788. Rotated Digits
// Difficulty: Medium
// Tags     : Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotated-digits/
// Runtime  : 3 ms (beats 95%)
// Memory   : 42160000 (beats 57%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) count++;
        }
        return count;
    }

    private boolean isGood(int num) {
        boolean changed = false;
        while (num > 0) {
            int d = num % 10;
            if (d == 3 || d == 4 || d == 7) return false;
            if (d == 2 || d == 5 || d == 6 || d == 9) changed = true;
            num /= 10;
        }
        return changed;
    }
}
