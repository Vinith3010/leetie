// ──────────────────────────────────────────────────
// Problem  : 944. Delete Columns to Make Sorted
// Difficulty: Easy
// Tags     : Array, String, Longest Increasing Subsequence
// Link     : https://leetcode.com/problems/delete-columns-to-make-sorted/
// Runtime  : 8 ms (beats 72%)
// Memory   : 46896000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;

        for (int c = 0; c < cols; c++) {
            for (int r = 1; r < rows; r++) {
                if (strs[r].charAt(c) < strs[r - 1].charAt(c)) {
                    count++;
                    break; // no need to check further rows for this column
                }
            }
        }
        return count;
    }
}
