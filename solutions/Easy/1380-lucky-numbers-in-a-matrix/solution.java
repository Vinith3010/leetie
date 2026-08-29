// ──────────────────────────────────────────────────
// Problem  : 1380. Lucky Numbers in a Matrix
// Difficulty: Easy
// Tags     : Array, Matrix
// Link     : https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Runtime  : 4 ms (beats 26%)
// Memory   : 47100000 (beats 51%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] rowMin = new int[m];
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        int[] colMax = new int[n];
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // Find min in each row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        // Check lucky numbers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
