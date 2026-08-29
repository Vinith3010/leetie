// ──────────────────────────────────────────────────
// Problem  : 1544. Make The String Great
// Difficulty: Easy
// Tags     : String, Stack
// Link     : https://leetcode.com/problems/make-the-string-great/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43620000 (beats 54%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - c) == 32) {
                sb.deleteCharAt(sb.length() - 1); // remove the last char
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
