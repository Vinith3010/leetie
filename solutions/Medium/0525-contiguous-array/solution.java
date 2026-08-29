// ──────────────────────────────────────────────────
// Problem  : 525. Contiguous Array
// Difficulty: Medium
// Tags     : Array, Hash Table, Prefix Sum
// Link     : https://leetcode.com/problems/contiguous-array/
// Runtime  : 24 ms (beats 54%)
// Memory   : 65720000 (beats 13%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // balance 0 seen at index -1
        
        int maxLen = 0, balance = 0;
        for (int i = 0; i < nums.length; i++) {
            balance += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(balance)) {
                maxLen = Math.max(maxLen, i - map.get(balance));
            } else {
                map.put(balance, i);
            }
        }
        return maxLen;
    }
}
