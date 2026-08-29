// ──────────────────────────────────────────────────
// Problem  : 1528. Shuffle String
// Difficulty: Easy
// Tags     : Array, String
// Link     : https://leetcode.com/problems/shuffle-string/
// Runtime  : 1 ms (beats 64%)
// Memory   : 45508000 (beats 56%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
