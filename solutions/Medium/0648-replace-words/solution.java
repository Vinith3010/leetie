// ──────────────────────────────────────────────────
// Problem  : 648. Replace Words
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Trie
// Link     : https://leetcode.com/problems/replace-words/
// Runtime  : 714 ms (beats 7%)
// Memory   : 62792000 (beats 52%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        StringBuilder result = new StringBuilder();
        
        for (String word : sentence.split(" ")) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (dict.contains(prefix)) {
                    break;
                }
            }
            result.append(prefix).append(" ");
        }
        
        return result.toString().trim();
    }
}
