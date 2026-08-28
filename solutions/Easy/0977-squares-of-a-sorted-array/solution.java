// ──────────────────────────────────────────────────
// Problem  : 977. Squares of a Sorted Array
// Difficulty: Easy
// Tags     : Array, Two Pointers, Sorting
// Link     : https://leetcode.com/problems/squares-of-a-sorted-array/
// Runtime  : 1 ms (beats 100%)
// Memory   : 47524000 (beats 36%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0, right = n - 1;
        int pos = n - 1; // fill from end
        
        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            
            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        
        return result;
    }
}
