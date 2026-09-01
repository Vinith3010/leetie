// ──────────────────────────────────────────────────
// Problem  : 676. Implement Magic Dictionary
// Difficulty: Medium
// Tags     : Hash Table, String, Depth-First Search, Design, Trie
// Link     : https://leetcode.com/problems/implement-magic-dictionary/
// Runtime  : 148 ms (beats 20%)
// Memory   : 58384000 (beats 15%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class MagicDictionary {
    private Set<String> dict;
    private Map<String, List<String>> patterns;

    public MagicDictionary() {
        dict = new HashSet<>();
        patterns = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for (String word : dictionary) {
            dict.add(word);
            for (int i = 0; i < word.length(); i++) {
                String pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                patterns.computeIfAbsent(pattern, k -> new ArrayList<>()).add(word);
            }
        }
    }

    public boolean search(String searchWord) {
        for (int i = 0; i < searchWord.length(); i++) {
            String pattern = searchWord.substring(0, i) + "*" + searchWord.substring(i + 1);
            if (patterns.containsKey(pattern)) {
                for (String candidate : patterns.get(pattern)) {
                    if (!candidate.equals(searchWord)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
