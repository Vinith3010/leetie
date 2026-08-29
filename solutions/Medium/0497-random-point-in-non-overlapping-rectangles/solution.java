// ──────────────────────────────────────────────────
// Problem  : 497. Random Point in Non-overlapping Rectangles
// Difficulty: Medium
// Tags     : Array, Math, Binary Search, Reservoir Sampling, Prefix Sum, Ordered Set, Randomized
// Link     : https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/
// Runtime  : 56 ms (beats 34%)
// Memory   : 52452000 (beats 94%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    private int[][] rects;
    private int[] prefix;
    private Random rand;

    public Solution(int[][] rects) {
        this.rects = rects;
        this.rand = new Random();
        this.prefix = new int[rects.length];
        
        int sum = 0;
        for (int i = 0; i < rects.length; i++) {
            int[] r = rects[i];
            int area = (r[2] - r[0] + 1) * (r[3] - r[1] + 1);
            sum += area;
            prefix[i] = sum;
        }
    }

    public int[] pick() {
        int target = rand.nextInt(prefix[prefix.length - 1]) + 1;
        int idx = Arrays.binarySearch(prefix, target);
        if (idx < 0) idx = -idx - 1;
        
        int[] r = rects[idx];
        int x = r[0] + rand.nextInt(r[2] - r[0] + 1);
        int y = r[1] + rand.nextInt(r[3] - r[1] + 1);
        return new int[]{x, y};
    }
}
