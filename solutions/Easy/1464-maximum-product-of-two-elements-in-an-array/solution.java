// ──────────────────────────────────────────────────
// Problem  : 1464. Maximum Product of Two Elements in an Array
// Difficulty: Easy
// Tags     : Array, Sorting, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// Runtime  : 6 ms (beats 13%)
// Memory   : 45236000 (beats 6%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
}
