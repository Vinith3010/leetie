// ──────────────────────────────────────────────────
// Problem  : 53. Maximum Subarray
// Difficulty: Medium
// Tags     : Array, Divide and Conquer, Dynamic Programming
// Link     : https://leetcode.com/problems/maximum-subarray/
// Runtime  : 1 ms (beats 100%)
// Memory   : 77352000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];   // running sum
        int max = nums[0];   // best answer so far
        
        for (int i = 1; i < nums.length; i++) {
            // either extend the current sum or start fresh at nums[i]
            sum = Math.max(nums[i], sum + nums[i]);
            // update global maximum
            max = Math.max(max, sum);
        }
        
        return max;
    }
}
