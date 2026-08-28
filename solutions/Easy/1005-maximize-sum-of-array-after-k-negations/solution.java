// ──────────────────────────────────────────────────
// Problem  : 1005. Maximize Sum Of Array After K Negations
// Difficulty: Easy
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
// Runtime  : 6 ms (beats 90%)
// Memory   : 44916000 (beats 9%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        
        // Flip negatives first
        while (i < nums.length && k > 0 && nums[i] < 0) {
            nums[i] = -nums[i];
            i++;
            k--;
        }
        
        // Resort after flipping
        Arrays.sort(nums);
        
        // If k is odd, flip the smallest element
        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }
        
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }
}
