// ──────────────────────────────────────────────────
// Problem  : 1047. Remove All Adjacent Duplicates In String
// Difficulty: Easy
// Tags     : String, Stack
// Link     : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// Runtime  : 10 ms (beats 97%)
// Memory   : 47352000 (beats 27%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1); // remove adjacent duplicate
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
