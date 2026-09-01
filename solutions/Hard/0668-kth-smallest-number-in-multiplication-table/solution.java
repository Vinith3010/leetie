// ──────────────────────────────────────────────────
// Problem  : 668. Kth Smallest Number in Multiplication Table
// Difficulty: Hard
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/
// Runtime  : 9 ms (beats 97%)
// Memory   : 42504000 (beats 8%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m * n;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countLessEqual(mid, m, n) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    private int countLessEqual(int x, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(x / i, n);
        }
        return count;
    }
}
