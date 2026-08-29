// ──────────────────────────────────────────────────
// Problem  : 475. Heaters
// Difficulty: Medium
// Tags     : Array, Two Pointers, Binary Search, Sorting
// Link     : https://leetcode.com/problems/heaters/
// Runtime  : 24 ms (beats 22%)
// Memory   : 47692000 (beats 92%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int radius = 0;
        for (int house : houses) {
            int idx = Arrays.binarySearch(heaters, house);
            if (idx < 0) {
                idx = -(idx + 1);
            }
            
            int dist1 = (idx == heaters.length) ? Integer.MAX_VALUE : Math.abs(heaters[idx] - house);
            int dist2 = (idx == 0) ? Integer.MAX_VALUE : Math.abs(heaters[idx - 1] - house);
            
            radius = Math.max(radius, Math.min(dist1, dist2));
        }
        return radius;
    }
}
