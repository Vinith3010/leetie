// ──────────────────────────────────────────────────
// Problem  : 31. Next Permutation
// Difficulty: Medium
// Tags     : Array, Two Pointers
// Link     : https://leetcode.com/problems/next-permutation/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44076000 (beats 99%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find successor
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap
            swap(nums, i, j);
        }

        // Step 4: Reverse suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
