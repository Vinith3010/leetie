// ──────────────────────────────────────────────────
// Problem  : 665. Non-decreasing Array
// Difficulty: Medium
// Tags     : Array
// Link     : https://leetcode.com/problems/non-decreasing-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46968000 (beats 85%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (count == 1) return false;
                count++;
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]; // adjust current
                } else {
                    nums[i + 1] = nums[i]; // adjust next
                }
            }
        }
        return true;
    }
}
