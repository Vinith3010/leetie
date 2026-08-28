// ──────────────────────────────────────────────────
// Problem  : 976. Largest Perimeter Triangle
// Difficulty: Easy
// Tags     : Array, Math, Greedy, Sorting, Quicksort, Polygons
// Link     : https://leetcode.com/problems/largest-perimeter-triangle/
// Runtime  : 12 ms (beats 34%)
// Memory   : 47728000 (beats 39%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);  // Sort ascending
        for (int i = nums.length - 1; i >= 2; i--) {
            // Check triangle inequality: a + b > c
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0; // No valid triangle
    }
}
