// ──────────────────────────────────────────────────
// Problem  : 1512. Number of Good Pairs
// Difficulty: Easy
// Tags     : Array, Hash Table, Math, Counting
// Link     : https://leetcode.com/problems/number-of-good-pairs/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42628000 (beats 79%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101]; // since 1 <= nums[i] <= 100
        int result = 0;
        
        for (int num : nums) {
            result += count[num]; // add pairs formed with previous occurrences
            count[num]++;         // increment frequency
        }
        
        return result;
    }
}
