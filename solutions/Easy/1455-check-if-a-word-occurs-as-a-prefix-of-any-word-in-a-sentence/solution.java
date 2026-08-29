// ──────────────────────────────────────────────────
// Problem  : 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
// Difficulty: Easy
// Tags     : Two Pointers, String, String Matching
// Link     : https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42744000 (beats 43%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // 1-based index
            }
        }
        return -1;
    }
}
