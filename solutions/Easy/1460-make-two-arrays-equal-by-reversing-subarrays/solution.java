// ──────────────────────────────────────────────────
// Problem  : 1460. Make Two Arrays Equal by Reversing Subarrays
// Difficulty: Easy
// Tags     : Array, Hash Table, Sorting
// Link     : https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/
// Runtime  : 9 ms (beats 14%)
// Memory   : 46888000 (beats 24%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
