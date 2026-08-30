// ──────────────────────────────────────────────────
// Problem  : 624. Maximum Distance in Arrays
// Difficulty: Medium
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/maximum-distance-in-arrays/
// Runtime  : 7 ms (beats 61%)
// Memory   : 143168000 (beats 40%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> arr = arrays.get(i);
            int first = arr.get(0);
            int last = arr.get(arr.size() - 1);

            res = Math.max(res, Math.abs(last - minVal));
            res = Math.max(res, Math.abs(maxVal - first));

            minVal = Math.min(minVal, first);
            maxVal = Math.max(maxVal, last);
        }
        return res;
    }
}
