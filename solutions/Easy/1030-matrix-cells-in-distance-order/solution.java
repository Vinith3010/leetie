// ──────────────────────────────────────────────────
// Problem  : 1030. Matrix Cells in Distance Order
// Difficulty: Easy
// Tags     : Array, Math, Geometry, Sorting, Matrix
// Link     : https://leetcode.com/problems/matrix-cells-in-distance-order/
// Runtime  : 15 ms (beats 42%)
// Memory   : 48240000 (beats 31%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        int index = 0;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[index++] = new int[]{r, c};
            }
        }
        
        Arrays.sort(result, (a, b) -> 
            (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) -
            (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))
        );
        
        return result;
    }
}
