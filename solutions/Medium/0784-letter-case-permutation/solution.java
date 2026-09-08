// ──────────────────────────────────────────────────
// Problem  : 784. Letter Case Permutation
// Difficulty: Medium
// Tags     : String, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/letter-case-permutation/
// Runtime  : 1 ms (beats 100%)
// Memory   : 47320000 (beats 55%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        if (Character.isLetter(chars[index])) {
            // branch with lowercase
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index + 1, result);

            // branch with uppercase
            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
        } else {
            backtrack(chars, index + 1, result);
        }
    }
}
