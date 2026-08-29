// ──────────────────────────────────────────────────
// Problem  : 523. Continuous Subarray Sum
// Difficulty: Medium
// Tags     : Array, Hash Table, Math, Prefix Sum, Pigeonhole Principle
// Link     : https://leetcode.com/problems/continuous-subarray-sum/
// Runtime  : 24 ms (beats 62%)
// Memory   : 139720000 (beats 50%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // remainder 0 seen at index -1
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = k == 0 ? sum : sum % k;
            
            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) return true;
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}
