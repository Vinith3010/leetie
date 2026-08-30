// ──────────────────────────────────────────────────
// Problem  : 659. Split Array into Consecutive Subsequences
// Difficulty: Medium
// Tags     : Array, Hash Table, Greedy, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/split-array-into-consecutive-subsequences/
// Runtime  : 27 ms (beats 81%)
// Memory   : 48212000 (beats 73%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums) {
            if (count.get(num) == 0) continue;
            count.put(num, count.get(num) - 1);
            
            if (end.getOrDefault(num - 1, 0) > 0) {
                end.put(num - 1, end.get(num - 1) - 1);
                end.put(num, end.getOrDefault(num, 0) + 1);
            } else if (count.getOrDefault(num + 1, 0) > 0 && count.getOrDefault(num + 2, 0) > 0) {
                count.put(num + 1, count.get(num + 1) - 1);
                count.put(num + 2, count.get(num + 2) - 1);
                end.put(num + 2, end.getOrDefault(num + 2, 0) + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
