// ──────────────────────────────────────────────────
// Problem  : 554. Brick Wall
// Difficulty: Medium
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/brick-wall/
// Runtime  : 15 ms (beats 44%)
// Memory   : 51172000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> edgeCount = new HashMap<>();
        int maxEdges = 0;

        for (List<Integer> row : wall) {
            int sum = 0;
            // Skip the last brick to avoid counting the wall's edge
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                edgeCount.put(sum, edgeCount.getOrDefault(sum, 0) + 1);
                maxEdges = Math.max(maxEdges, edgeCount.get(sum));
            }
        }

        return wall.size() - maxEdges;
    }
}
