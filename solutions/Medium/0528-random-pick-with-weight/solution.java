// ──────────────────────────────────────────────────
// Problem  : 528. Random Pick with Weight
// Difficulty: Medium
// Tags     : Array, Math, Binary Search, Prefix Sum, Randomized
// Link     : https://leetcode.com/problems/random-pick-with-weight/
// Runtime  : 24 ms (beats 93%)
// Memory   : 51728000 (beats 66%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    private int[] prefix;
    private Random rand;

    public Solution(int[] w) {
        prefix = new int[w.length];
        rand = new Random();
        prefix[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            prefix[i] = prefix[i - 1] + w[i];
        }
    }

    public int pickIndex() {
        int target = rand.nextInt(prefix[prefix.length - 1]) + 1;
        int idx = Arrays.binarySearch(prefix, target);
        if (idx < 0) idx = -idx - 1;
        return idx;
    }
}
