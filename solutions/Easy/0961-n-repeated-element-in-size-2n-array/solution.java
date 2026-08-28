// ──────────────────────────────────────────────────
// Problem  : 961. N-Repeated Element in Size 2N Array
// Difficulty: Easy
// Tags     : Array, Hash Table, Pigeonhole Principle
// Link     : https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47328000 (beats 73%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int repeatedNTimes(int[] nums) {
        // Use a HashSet to track seen elements
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (!seen.add(num)) {
                // If add() returns false, num is already present
                return num;
            }
        }
        
        // Problem guarantees a solution, so this won't be reached
        return -1;
    }
}
