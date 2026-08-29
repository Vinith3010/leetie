// ──────────────────────────────────────────────────
// Problem  : 1534. Count Good Triplets
// Difficulty: Easy
// Tags     : Array, Enumeration
// Link     : https://leetcode.com/problems/count-good-triplets/
// Runtime  : 13 ms (beats 66%)
// Memory   : 42964000 (beats 78%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
