// ──────────────────────────────────────────────────
// Problem  : 593. Valid Square
// Difficulty: Medium
// Tags     : Math, Geometry
// Link     : https://leetcode.com/problems/valid-square/
// Runtime  : 2 ms (beats 64%)
// Memory   : 43228000 (beats 78%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dists = {
            dist(p1, p2), dist(p1, p3), dist(p1, p4),
            dist(p2, p3), dist(p2, p4), dist(p3, p4)
        };
        Arrays.sort(dists);
        return dists[0] > 0 &&
               dists[0] == dists[1] &&
               dists[1] == dists[2] &&
               dists[2] == dists[3] &&
               dists[4] == dists[5] &&
               dists[4] == 2 * dists[0];
    }

    private int dist(int[] a, int[] b) {
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}
