// ──────────────────────────────────────────────────
// Problem  : 791. Custom Sort String
// Difficulty: Medium
// Tags     : Hash Table, String, Sorting
// Link     : https://leetcode.com/problems/custom-sort-string/
// Runtime  : 1 ms (beats 92%)
// Memory   : 42648000 (beats 90%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        // Step 1: place characters in order
        for (char c : order.toCharArray()) {
            while (freq[c - 'a'] > 0) {
                sb.append(c);
                freq[c - 'a']--;
            }
        }

        // Step 2: place remaining characters
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                sb.append((char)(i + 'a'));
                freq[i]--;
            }
        }

        return sb.toString();
    }
}
