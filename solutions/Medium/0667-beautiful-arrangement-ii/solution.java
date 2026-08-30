// ──────────────────────────────────────────────────
// Problem  : 667. Beautiful Arrangement II
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/beautiful-arrangement-ii/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46736000 (beats 34%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int left = 1, right = n;
        int index = 0;

        // Create k distinct differences
        while (k > 1) {
            if (k % 2 == 1) {
                result[index++] = left++;
            } else {
                result[index++] = right--;
            }
            k--;
        }

        // Fill remaining sequentially
        if (k % 2 == 1) {
            for (int i = left; i <= right; i++) {
                result[index++] = i;
            }
        } else {
            for (int i = right; i >= left; i--) {
                result[index++] = i;
            }
        }
        return result;
    }
}
