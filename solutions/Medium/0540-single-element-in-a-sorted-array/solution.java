// ──────────────────────────────────────────────────
// Problem  : 540. Single Element in a Sorted Array
// Difficulty: Medium
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/single-element-in-a-sorted-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 53016000 (beats 22%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even for comparison
            if (mid % 2 == 1) mid--;
            
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
