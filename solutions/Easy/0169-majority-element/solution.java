// ──────────────────────────────────────────────────
// Problem  : 169. Majority Element
// Difficulty: Easy
// Tags     : Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
// Link     : https://leetcode.com/problems/majority-element/
// Runtime  : 1 ms (beats 100%)
// Memory   : 55832000 (beats 18%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}
