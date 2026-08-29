// ──────────────────────────────────────────────────
// Problem  : 1539. Kth Missing Positive Number
// Difficulty: Easy
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/kth-missing-positive-number/
// Runtime  : 1 ms (beats 23%)
// Memory   : 44648000 (beats 40%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int current = 1;
        int index = 0;

        while (true) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
    }
}
