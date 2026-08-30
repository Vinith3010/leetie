// ──────────────────────────────────────────────────
// Problem  : 621. Task Scheduler
// Difficulty: Medium
// Tags     : Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting
// Link     : https://leetcode.com/problems/task-scheduler/
// Runtime  : 4 ms (beats 73%)
// Memory   : 48444000 (beats 22%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;
        
        Arrays.sort(freq);
        int maxFreq = freq[25];
        int countMax = 0;
        for (int f : freq) {
            if (f == maxFreq) countMax++;
        }
        
        int partCount = maxFreq - 1;
        int partLength = n + 1;
        int emptySlots = partCount * partLength + countMax;
        
        return Math.max(tasks.length, emptySlots);
    }
}
