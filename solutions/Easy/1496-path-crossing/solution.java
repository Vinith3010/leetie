// ──────────────────────────────────────────────────
// Problem  : 1496. Path Crossing
// Difficulty: Easy
// Tags     : Hash Table, String
// Link     : https://leetcode.com/problems/path-crossing/
// Runtime  : 3 ms (beats 81%)
// Memory   : 43688000 (beats 22%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add("0,0");

        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;

            String pos = x + "," + y;
            if (visited.contains(pos)) {
                return true;
            }
            visited.add(pos);
        }
        return false;
    }
}
