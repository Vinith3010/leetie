// ──────────────────────────────────────────────────
// Problem  : 1399. Count Largest Group
// Difficulty: Easy
// Tags     : Hash Table, Math, Counting
// Link     : https://leetcode.com/problems/count-largest-group/
// Runtime  : 19 ms (beats 6%)
// Memory   : 42680000 (beats 53%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;

        // Count digit sums
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, map.get(sum));
        }

        // Count groups with max size
        int count = 0;
        for (int size : map.values()) {
            if (size == maxSize) count++;
        }
        return count;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
