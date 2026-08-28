// ──────────────────────────────────────────────────
// Problem  : 1021. Remove Outermost Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/remove-outermost-parentheses/
// Runtime  : 2 ms (beats 100%)
// Memory   : 43496000 (beats 70%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) result.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) result.append(ch);
            }
        }
        
        return result.toString();
    }
}
