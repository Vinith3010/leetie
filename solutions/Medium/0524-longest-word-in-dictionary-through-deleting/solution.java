// ──────────────────────────────────────────────────
// Problem  : 524. Longest Word in Dictionary through Deleting
// Difficulty: Medium
// Tags     : Array, Two Pointers, String, Sorting
// Link     : https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
// Runtime  : 18 ms (beats 42%)
// Memory   : 47692000 (beats 58%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String longest = "";
        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                if (word.length() > longest.length() ||
                   (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                    longest = word;
                }
            }
        }
        return longest;
    }

    private boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) i++;
            j++;
        }
        return i == word.length();
    }
}
