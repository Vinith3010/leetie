// ──────────────────────────────────────────────────
// Problem  : 483. Smallest Good Base
// Difficulty: Hard
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/smallest-good-base/
// Runtime  : 2 ms (beats 77%)
// Memory   : 42584000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        int maxLen = (int)(Math.log(num) / Math.log(2)); // maximum possible length
        
        // Try lengths from maxLen down to 2
        for (int m = maxLen; m >= 2; m--) {
            long k = searchBase(num, m);
            if (k != -1) return String.valueOf(k);
        }
        return String.valueOf(num - 1); // fallback base
    }
    
    private long searchBase(long num, int m) {
        long left = 2, right = (long)Math.pow(num, 1.0 / m) + 1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = 1, curr = 1;
            for (int i = 1; i <= m; i++) {
                curr *= mid;
                if (curr > num) break;
                sum += curr;
            }
            if (sum == num) return mid;
            else if (sum < num) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
