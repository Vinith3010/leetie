// ──────────────────────────────────────────────────
// Problem  : 1037. Valid Boomerang
// Difficulty: Easy
// Tags     : Array, Math, Geometry
// Link     : https://leetcode.com/problems/valid-boomerang/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42844000 (beats 69%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        
        // Check if all points are distinct
        if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
            return false;
        }
        
        // Check if points are collinear using area of triangle formula
        return (y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1);
    }
}
