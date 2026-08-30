// ──────────────────────────────────────────────────
// Problem  : 406. Queue Reconstruction by Height
// Difficulty: Medium
// Tags     : Array, Binary Indexed Tree, Segment Tree, Sorting
// Link     : https://leetcode.com/problems/queue-reconstruction-by-height/
// Runtime  : 8 ms (beats 41%)
// Memory   : 47408000 (beats 27%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });

        List<int[]> result = new LinkedList<>();
        for (int[] person : people) {
            result.add(person[1], person);
        }

        return result.toArray(new int[people.length][]);
    }
}
