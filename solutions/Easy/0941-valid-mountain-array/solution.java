// ──────────────────────────────────────────────────
// Problem  : 941. Valid Mountain Array
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/valid-mountain-array/
// Runtime  : 1 ms (beats 100%)
// Memory   : 47268000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // walk up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // peak can't be first or last
        if (i == 0 || i == n - 1) return false;

        // walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
