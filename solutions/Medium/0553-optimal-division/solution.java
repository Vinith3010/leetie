// ──────────────────────────────────────────────────
// Problem  : 553. Optimal Division
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming
// Link     : https://leetcode.com/problems/optimal-division/
// Runtime  : 3 ms (beats 88%)
// Memory   : 43256000 (beats 31%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) return String.valueOf(nums[0]);
        if (nums.length == 2) return nums[0] + "/" + nums[1];
        
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(").append(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sb.append("/").append(nums[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}
