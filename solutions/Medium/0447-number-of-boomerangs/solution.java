// ──────────────────────────────────────────────────
// Problem  : 447. Number of Boomerangs
// Difficulty: Medium
// Tags     : Array, Hash Table, Math
// Link     : https://leetcode.com/problems/number-of-boomerangs/
// Runtime  : 138 ms (beats 40%)
// Memory   : 47156000 (beats 7%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int dist = dx * dx + dy * dy;
                
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            
            for (int count : map.values()) {
                // For each pair of points at same distance, permutations count
                result += count * (count - 1);
            }
        }
        
        return result;
    }
}
