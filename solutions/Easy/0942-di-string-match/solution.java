// ──────────────────────────────────────────────────
// Problem  : 942. DI String Match
// Difficulty: Easy
// Tags     : Array, Two Pointers, String, Greedy
// Link     : https://leetcode.com/problems/di-string-match/
// Runtime  : 2 ms (beats 99%)
// Memory   : 47604000 (beats 11%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0, high = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low;
        return result;
    }
}
