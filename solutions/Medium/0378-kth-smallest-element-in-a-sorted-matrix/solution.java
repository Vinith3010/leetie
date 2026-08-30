// ──────────────────────────────────────────────────
// Problem  : 378. Kth Smallest Element in a Sorted Matrix
// Difficulty: Medium
// Tags     : Array, Binary Search, Sorting, Heap (Priority Queue), Matrix
// Link     : https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
// Runtime  : 0 ms (beats 100%)
// Memory   : 52016000 (beats 20%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0], right = matrix[n - 1][n - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int countLessEqual(int[][] matrix, int mid) {
        int n = matrix.length;
        int count = 0, row = n - 1, col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return count;
    }
}
