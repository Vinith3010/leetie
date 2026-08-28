// ──────────────────────────────────────────────────
// Problem  : 153. Find Minimum in Rotated Sorted Array
// Difficulty: Medium
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43604000 (beats 74%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
        int min = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[low]<=nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid+1;
            }
            else if(nums[mid] <= nums[high]){
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
            else if(nums[low] > nums[mid] && nums[mid] < nums[high]){
                min = Math.min(min, nums[mid]);
            }
        }
        return min; 
    }
}