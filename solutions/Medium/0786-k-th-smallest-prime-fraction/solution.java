// ──────────────────────────────────────────────────
// Problem  : 786. K-th Smallest Prime Fraction
// Difficulty: Medium
// Tags     : Array, Two Pointers, Binary Search, Sorting, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/k-th-smallest-prime-fraction/
// Runtime  : 5 ms (beats 77%)
// Memory   : 43916000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0.0, high = 1.0;
        int p = 0, q = 1;

        while (true) {
            double mid = (low + high) / 2.0;
            int count = 0;
            p = 0;
            double maxFrac = 0.0;

            int i = -1;
            for (int j = 1; j < n; j++) {
                while (i + 1 < j && arr[i + 1] < mid * arr[j]) {
                    i++;
                }
                count += (i + 1);
                if (i >= 0) {
                    double frac = (double) arr[i] / arr[j];
                    if (frac > maxFrac) {
                        maxFrac = frac;
                        p = arr[i];
                        q = arr[j];
                    }
                }
            }

            if (count == k) {
                return new int[]{p, q};
            } else if (count < k) {
                low = mid;
            } else {
                high = mid;
            }
        }
    }
}
