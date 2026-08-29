// ──────────────────────────────────────────────────
// Problem  : 564. Find the Closest Palindrome
// Difficulty: Hard
// Tags     : Math, String
// Link     : https://leetcode.com/problems/find-the-closest-palindrome/
// Runtime  : 4 ms (beats 39%)
// Memory   : 43244000 (beats 71%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public String nearestPalindromic(String n) {
        int len = n.length();
        long num = Long.parseLong(n);

        Set<Long> candidates = new HashSet<>();
        // Edge cases
        candidates.add((long)Math.pow(10, len) + 1);
        candidates.add((long)Math.pow(10, len - 1) - 1);

        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        for (long i = prefix - 1; i <= prefix + 1; i++) {
            String p = String.valueOf(i);
            String candidate;
            if (len % 2 == 0) {
                candidate = p + new StringBuilder(p).reverse().toString();
            } else {
                candidate = p + new StringBuilder(p.substring(0, p.length() - 1)).reverse().toString();
            }
            candidates.add(Long.parseLong(candidate));
        }

        long closest = -1;
        for (long cand : candidates) {
            if (cand == num) continue;
            if (closest == -1 ||
                Math.abs(cand - num) < Math.abs(closest - num) ||
                (Math.abs(cand - num) == Math.abs(closest - num) && cand < closest)) {
                closest = cand;
            }
        }
        return String.valueOf(closest);
    }
}
