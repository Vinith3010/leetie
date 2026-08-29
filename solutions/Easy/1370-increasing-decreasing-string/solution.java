// ──────────────────────────────────────────────────
// Problem  : 1370. Increasing Decreasing String
// Difficulty: Easy
// Tags     : Hash Table, String, Counting
// Link     : https://leetcode.com/problems/increasing-decreasing-string/
// Runtime  : 3 ms (beats 88%)
// Memory   : 44964000 (beats 42%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            // Increasing order
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
            // Decreasing order
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
