// ──────────────────────────────────────────────────
// Problem  : 698. Partition to K Equal Sum Subsets
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Backtracking, Bit Manipulation, Memoization, Bitmask
// Link     : https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
// Runtime  : 500 ms (beats 37%)
// Memory   : 42792000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % k != 0) return false;
        int target = sum / k;

        Arrays.sort(nums);
        if (nums[nums.length - 1] > target) return false;

        boolean[] visited = new boolean[nums.length];
        return backtrack(nums, visited, k, 0, 0, target);
    }

    private boolean backtrack(int[] nums, boolean[] visited, int k, int start, int currSum, int target) {
        if (k == 1) return true; // last subset automatically valid
        if (currSum == target) {
            // one subset complete, move to next
            return backtrack(nums, visited, k - 1, 0, 0, target);
        }

        for (int i = start; i < nums.length; i++) {
            if (visited[i]) continue;
            if (currSum + nums[i] > target) continue;

            visited[i] = true;
            if (backtrack(nums, visited, k, i + 1, currSum + nums[i], target)) return true;
            visited[i] = false;
        }
        return false;
    }
}
