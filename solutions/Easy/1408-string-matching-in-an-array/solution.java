// ──────────────────────────────────────────────────
// Problem  : 1408. String Matching in an Array
// Difficulty: Easy
// Tags     : Array, String, String Matching
// Link     : https://leetcode.com/problems/string-matching-in-an-array/
// Runtime  : 4 ms (beats 97%)
// Memory   : 43536000 (beats 81%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // no need to check further once found
                }
            }
        }
        return result;
    }
}
