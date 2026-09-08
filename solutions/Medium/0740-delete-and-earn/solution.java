// ──────────────────────────────────────────────────
// Problem  : 740. Delete and Earn
// Difficulty: Medium
// Tags     : Array, Hash Table, Dynamic Programming
// Link     : https://leetcode.com/problems/delete-and-earn/
// Runtime  : 3 ms (beats 73%)
// Memory   : 46984000 (beats 47%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] points = new int[max + 1];
        for (int num : nums) {
            points[num] += num;
        }

        return rob(points);
    }

    private int rob(int[] points) {
        int prev = 0, curr = 0;
        for (int p : points) {
            int temp = curr;
            curr = Math.max(curr, prev + p);
            prev = temp;
        }
        return curr;
    }
}
