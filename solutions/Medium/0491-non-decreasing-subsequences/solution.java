// ──────────────────────────────────────────────────
// Problem  : 491. Non-decreasing Subsequences
// Difficulty: Medium
// Tags     : Array, Hash Table, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/non-decreasing-subsequences/
// Runtime  : 17 ms (beats 30%)
// Memory   : 53620000 (beats 15%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }
    
    private void backtrack(int[] nums, int start, List<Integer> path, Set<List<Integer>> result) {
        if (path.size() >= 2) {
            result.add(new ArrayList<>(path));
        }
        
        for (int i = start; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1)) continue;
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
