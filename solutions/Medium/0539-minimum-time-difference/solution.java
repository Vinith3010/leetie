// ──────────────────────────────────────────────────
// Problem  : 539. Minimum Time Difference
// Difficulty: Medium
// Tags     : Array, Math, String, Sorting
// Link     : https://leetcode.com/problems/minimum-time-difference/
// Runtime  : 18 ms (beats 10%)
// Memory   : 48260000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int n = timePoints.size();
        int minDiff = Integer.MAX_VALUE;
        
        int first = toMinutes(timePoints.get(0));
        int prev = first;
        
        for (int i = 1; i < n; i++) {
            int curr = toMinutes(timePoints.get(i));
            minDiff = Math.min(minDiff, curr - prev);
            prev = curr;
        }
        
        // Compare last and first across midnight
        int last = toMinutes(timePoints.get(n - 1));
        minDiff = Math.min(minDiff, (24 * 60 - last) + first);
        
        return minDiff;
    }
    
    private int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
