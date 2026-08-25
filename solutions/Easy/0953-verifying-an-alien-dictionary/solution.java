// ──────────────────────────────────────────────────
// Problem  : 953. Verifying an Alien Dictionary
// Difficulty: Easy
// Tags     : Array, Hash Table, String
// Link     : https://leetcode.com/problems/verifying-an-alien-dictionary/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43600000 (beats 49%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!inCorrectOrder(words[i], words[i + 1], rank)) {
                return false;
            }
        }
        return true;
    }

    private boolean inCorrectOrder(String w1, String w2, int[] rank) {
        int len = Math.min(w1.length(), w2.length());
        for (int i = 0; i < len; i++) {
            char c1 = w1.charAt(i), c2 = w2.charAt(i);
            if (c1 != c2) {
                return rank[c1 - 'a'] < rank[c2 - 'a'];
            }
        }
        // If all characters are same up to min length, shorter word should come first
        return w1.length() <= w2.length();
    }
}
