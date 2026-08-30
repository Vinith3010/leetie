// ──────────────────────────────────────────────────
// Problem  : 646. Maximum Length of Pair Chain
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Greedy, Sorting, Longest Increasing Subsequence
// Link     : https://leetcode.com/problems/maximum-length-of-pair-chain/
// Runtime  : 8 ms (beats 99%)
// Memory   : 46896000 (beats 81%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int count = 0, currEnd = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (pair[0] > currEnd) {
                count++;
                currEnd = pair[1];
            }
        }
        return count;
    }
}
