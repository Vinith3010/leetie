// ──────────────────────────────────────────────────
// Problem  : 1018. Binary Prefix Divisible By 5
// Difficulty: Easy
// Tags     : Array, Bit Manipulation
// Link     : https://leetcode.com/problems/binary-prefix-divisible-by-5/
// Runtime  : 3 ms (beats 100%)
// Memory   : 47636000 (beats 46%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int prefix = 0;
        
        for (int bit : nums) {
            prefix = ((prefix << 1) + bit) % 5;
            result.add(prefix == 0);
        }
        
        return result;
    }
}
