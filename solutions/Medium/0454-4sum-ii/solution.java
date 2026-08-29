// ──────────────────────────────────────────────────
// Problem  : 454. 4Sum II
// Difficulty: Medium
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/4sum-ii/
// Runtime  : 110 ms (beats 69%)
// Memory   : 47112000 (beats 16%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Store sums of A and B
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        int count = 0;
        
        // For each sum of C and D, check complement in map
        for (int c : C) {
            for (int d : D) {
                int sum = c + d;
                count += map.getOrDefault(-sum, 0);
            }
        }
        
        return count;
    }
}
