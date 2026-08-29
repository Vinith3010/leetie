// ──────────────────────────────────────────────────
// Problem  : 494. Target Sum
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Backtracking, Knapsack Problem, 0-1 Knapsack
// Link     : https://leetcode.com/problems/target-sum/
// Runtime  : 2 ms (beats 100%)
// Memory   : 43204000 (beats 62%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;
        
        // If target is not achievable
        if ((sum + target) % 2 != 0 || sum < Math.abs(target)) return 0;
        
        int subsetSum = (sum + target) / 2;
        return countSubsets(nums, subsetSum);
    }
    
    private int countSubsets(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[target];
    }
}
