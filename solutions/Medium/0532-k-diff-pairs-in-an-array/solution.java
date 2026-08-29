// ──────────────────────────────────────────────────
// Problem  : 532. K-diff Pairs in an Array
// Difficulty: Medium
// Tags     : Array, Hash Table, Two Pointers, Binary Search, Sorting
// Link     : https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Runtime  : 12 ms (beats 41%)
// Memory   : 46196000 (beats 93%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) count++;
            } else {
                if (map.containsKey(num + k)) count++;
            }
        }
        return count;
    }
}
