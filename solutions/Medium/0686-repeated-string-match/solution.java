// ──────────────────────────────────────────────────
// Problem  : 686. Repeated String Match
// Difficulty: Medium
// Tags     : String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm, Boyer–Moore String-Search Algorithm
// Link     : https://leetcode.com/problems/repeated-string-match/
// Runtime  : 262 ms (beats 55%)
// Memory   : 43736000 (beats 47%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int repeatedStringMatch(String a, String b) {
        // Start with one repetition
        StringBuilder sb = new StringBuilder(a);
        int count = 1;

        // Keep repeating until length is at least b
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        // Check if b is now a substring
        if (sb.indexOf(b) != -1) {
            return count;
        }

        // One more repetition might be needed
        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) {
            return count;
        }

        // If still not found, return -1
        return -1;
    }
}
