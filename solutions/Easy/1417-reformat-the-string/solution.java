// ──────────────────────────────────────────────────
// Problem  : 1417. Reformat The String
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/reformat-the-string/
// Runtime  : 4 ms (beats 73%)
// Memory   : 44620000 (beats 77%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        // Separate letters and digits
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                letters.append(c);
            }
        }

        // If difference in counts > 1, impossible
        if (Math.abs(letters.length() - digits.length()) > 1) return "";

        StringBuilder result = new StringBuilder();
        boolean letterTurn = letters.length() >= digits.length();

        int i = 0, j = 0;
        while (i < letters.length() || j < digits.length()) {
            if (letterTurn && i < letters.length()) {
                result.append(letters.charAt(i++));
            } else if (!letterTurn && j < digits.length()) {
                result.append(digits.charAt(j++));
            }
            letterTurn = !letterTurn;
        }

        return result.toString();
    }
}
