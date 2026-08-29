// ──────────────────────────────────────────────────
// Problem  : 1450. Number of Students Doing Homework at a Given Time
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43684000 (beats 20%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }
}
