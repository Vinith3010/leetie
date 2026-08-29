// ──────────────────────────────────────────────────
// Problem  : 1403. Minimum Subsequence in Non-Increasing Order
// Difficulty: Easy
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
// Runtime  : 8 ms (beats 86%)
// Memory   : 52248000 (beats 68%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for (int num : nums) total += num;

        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            result.add(nums[i]);
            if (sum > total - sum) break;
        }
        return result;
    }
}
