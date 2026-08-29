// ──────────────────────────────────────────────────
// Problem  : 1491. Average Salary Excluding the Minimum and Maximum Salary
// Difficulty: Easy
// Tags     : Array, Sorting
// Link     : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// Runtime  : 0 ms (beats 100%)
// Memory   : 45584000 (beats 74%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}
