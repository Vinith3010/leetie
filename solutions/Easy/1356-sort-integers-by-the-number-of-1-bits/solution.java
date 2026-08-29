// ──────────────────────────────────────────────────
// Problem  : 1356. Sort Integers by The Number of 1 Bits
// Difficulty: Easy
// Tags     : Array, Bit Manipulation, Sorting, Counting
// Link     : https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
// Runtime  : 8 ms (beats 70%)
// Memory   : 46588000 (beats 65%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert to list for custom sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);

        // Sort by bit count, then by value
        Collections.sort(list, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);
            if (bitsA == bitsB) return a - b;
            return bitsA - bitsB;
        });

        // Convert back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
