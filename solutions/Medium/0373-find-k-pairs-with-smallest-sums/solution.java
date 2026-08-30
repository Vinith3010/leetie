// ──────────────────────────────────────────────────
// Problem  : 373. Find K Pairs with Smallest Sums
// Difficulty: Medium
// Tags     : Array, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
// Runtime  : 34 ms (beats 56%)
// Memory   : 138700000 (beats 43%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );

        // Initialize heap with pairs (nums1[i], nums2[0])
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{i, 0});
        }

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] idx = minHeap.poll();
            int i = idx[0], j = idx[1];
            result.add(Arrays.asList(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{i, j + 1});
            }
        }

        return result;
    }
}
