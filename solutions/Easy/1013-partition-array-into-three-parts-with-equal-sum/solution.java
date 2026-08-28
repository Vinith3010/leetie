// ──────────────────────────────────────────────────
// Problem  : 1013. Partition Array Into Three Parts With Equal Sum
// Difficulty: Easy
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
// Runtime  : 2 ms (beats 57%)
// Memory   : 55332000 (beats 84%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        
        if (total % 3 != 0) return false;
        int target = total / 3;
        
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == target) {
                count++;
                sum = 0;
            }
        }
        
        return count >= 3;
    }
}
