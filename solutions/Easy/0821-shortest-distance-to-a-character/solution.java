// ──────────────────────────────────────────────────
// Problem  : 821. Shortest Distance to a Character
// Difficulty: Easy
// Tags     : Array, Two Pointers, String
// Link     : https://leetcode.com/problems/shortest-distance-to-a-character/
// Runtime  : 1 ms (beats 100%)
// Memory   : 44168000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        
        // Pass 1: Left to Right
        int prev = -n; // initialize far left
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }
        
        // Pass 2: Right to Left
        prev = 2 * n; // initialize far right
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        
        return result;
    }
}
