// ──────────────────────────────────────────────────
// Problem  : 1385. Find the Distance Value Between Two Arrays
// Difficulty: Easy
// Tags     : Array, Two Pointers, Binary Search, Sorting
// Link     : https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
// Runtime  : 6 ms (beats 37%)
// Memory   : 46748000 (beats 10%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int num : arr1) {
            if (isValid(num, arr2, d)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int num, int[] arr2, int d) {
        int idx = Arrays.binarySearch(arr2, num);
        if (idx >= 0) return false; // exact match → distance 0

        int insertPoint = -idx - 1;
        if (insertPoint < arr2.length && Math.abs(arr2[insertPoint] - num) <= d) return false;
        if (insertPoint > 0 && Math.abs(arr2[insertPoint - 1] - num) <= d) return false;

        return true;
    }
}
