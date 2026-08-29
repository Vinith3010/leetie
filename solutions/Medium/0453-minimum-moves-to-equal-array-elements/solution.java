// ──────────────────────────────────────────────────
// Problem  : 453. Minimum Moves to Equal Array Elements
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
// Runtime  : 2 ms (beats 91%)
// Memory   : 47204000 (beats 51%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        long sum = 0;
        
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }
        
        // Formula: moves = sum - n * min
        return (int)(sum - (long)nums.length * min);
    }
}
