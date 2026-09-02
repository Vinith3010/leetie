// ──────────────────────────────────────────────────
// Problem  : 75. Sort Colors
// Difficulty: Medium
// Tags     : Array, Two Pointers, Sorting, Quicksort, Bubble Sort
// Link     : https://leetcode.com/problems/sort-colors/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43472000 (beats 59%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;        
        int mid = 0;         
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++; 
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

