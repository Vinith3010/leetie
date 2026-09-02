// ──────────────────────────────────────────────────
// Problem  : 2149. Rearrange Array Elements by Sign
// Difficulty: Medium
// Tags     : Array, Two Pointers, Simulation
// Link     : https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Runtime  : 3 ms (beats 100%)
// Memory   : 175388000 (beats 71%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos=0, neg=1;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                ans[pos] = nums[i];
                pos+=2;
            }
            else{
                ans[neg] = nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}