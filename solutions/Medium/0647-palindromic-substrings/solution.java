// ──────────────────────────────────────────────────
// Problem  : 647. Palindromic Substrings
// Difficulty: Medium
// Tags     : Two Pointers, String, Dynamic Programming
// Link     : https://leetcode.com/problems/palindromic-substrings/
// Runtime  : 6 ms (beats 62%)
// Memory   : 42976000 (beats 55%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int center = 0; center < 2 * s.length() - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
