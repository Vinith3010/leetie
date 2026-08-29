// ──────────────────────────────────────────────────
// Problem  : 472. Concatenated Words
// Difficulty: Hard
// Tags     : Array, String, Dynamic Programming, Depth-First Search, Trie, Sorting
// Link     : https://leetcode.com/problems/concatenated-words/
// Runtime  : 57 ms (beats 85%)
// Memory   : 50484000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> dict = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (canForm(word, dict)) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean canForm(String word, Set<String> dict) {
        int n = word.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for (int i = 1; i <= n; i++) {
            for (int j = (i == n ? 1 : 0); j < i; j++) {
                if (!dp[j]) continue;
                if (dict.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
