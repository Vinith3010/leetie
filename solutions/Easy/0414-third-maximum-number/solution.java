// ──────────────────────────────────────────────────
// Problem  : 414. Third Maximum Number
// Difficulty: Easy
// Tags     : Array, Sorting
// Link     : https://leetcode.com/problems/third-maximum-number/
// Runtime  : 1 ms (beats 99%)
// Memory   : 44596000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
