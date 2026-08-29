// ──────────────────────────────────────────────────
// Problem  : 1422. Maximum Score After Splitting a String
// Difficulty: Easy
// Tags     : String, Prefix Sum
// Link     : https://leetcode.com/problems/maximum-score-after-splitting-a-string/
// Runtime  : 1 ms (beats 99%)
// Memory   : 42580000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        int maxScore = 0;
        int leftZeros = 0;
        int rightOnes = totalOnes;

        // Split before the last character
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }
        return maxScore;
    }
}
