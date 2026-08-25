// ──────────────────────────────────────────────────
// Problem  : 3718. Smallest Missing Multiple of K
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/smallest-missing-multiple-of-k/
// Runtime  : 3 ms (beats 23%)
// Memory   : 45540000 (beats 26%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int multiple = k;
        while(st.contains(multiple)){
            multiple += k;
        }
        return multiple;
    }
}