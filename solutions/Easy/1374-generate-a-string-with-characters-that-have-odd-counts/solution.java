// ──────────────────────────────────────────────────
// Problem  : 1374. Generate a String With Characters That Have Odd Counts
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
// Runtime  : 1 ms (beats 96%)
// Memory   : 42852000 (beats 49%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            // For even n: use (n-1) 'a's and 1 'b'
            for (int i = 0; i < n - 1; i++) sb.append('a');
            sb.append('b');
        } else {
            // For odd n: use all 'a's
            for (int i = 0; i < n; i++) sb.append('a');
        }
        return sb.toString();
    }
}
