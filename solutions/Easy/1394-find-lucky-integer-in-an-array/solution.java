// ──────────────────────────────────────────────────
// Problem  : 1394. Find Lucky Integer in an Array
// Difficulty: Easy
// Tags     : Array, Hash Table, Counting
// Link     : https://leetcode.com/problems/find-lucky-integer-in-an-array/
// Runtime  : 5 ms (beats 73%)
// Memory   : 45040000 (beats 72%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int lucky = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (num == count) {
                lucky = Math.max(lucky, num);
            }
        }
        return lucky;
    }
}
