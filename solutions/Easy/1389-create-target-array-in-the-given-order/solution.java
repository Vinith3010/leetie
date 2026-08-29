// ──────────────────────────────────────────────────
// Problem  : 1389. Create Target Array in the Given Order
// Difficulty: Easy
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/create-target-array-in-the-given-order/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43372000 (beats 64%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        // Convert list back to array
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
