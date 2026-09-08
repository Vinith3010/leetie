// ──────────────────────────────────────────────────
// Problem  : 722. Remove Comments
// Difficulty: Medium
// Tags     : Array, String
// Link     : https://leetcode.com/problems/remove-comments/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43288000 (beats 69%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean inBlock = false;
        StringBuilder sb = new StringBuilder();

        for (String line : source) {
            int i = 0;
            char[] chars = line.toCharArray();
            if (!inBlock) sb = new StringBuilder();

            while (i < chars.length) {
                if (!inBlock && i + 1 < chars.length && chars[i] == '/' && chars[i + 1] == '*') {
                    inBlock = true;
                    i += 2;
                } else if (inBlock && i + 1 < chars.length && chars[i] == '*' && chars[i + 1] == '/') {
                    inBlock = false;
                    i += 2;
                } else if (!inBlock && i + 1 < chars.length && chars[i] == '/' && chars[i + 1] == '/') {
                    break; // ignore rest of line
                } else if (!inBlock) {
                    sb.append(chars[i]);
                    i++;
                } else {
                    i++;
                }
            }

            if (!inBlock && sb.length() > 0) {
                result.add(sb.toString());
            }
        }
        return result;
    }
}
