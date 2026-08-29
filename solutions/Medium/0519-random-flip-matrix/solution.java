// ──────────────────────────────────────────────────
// Problem  : 519. Random Flip Matrix
// Difficulty: Medium
// Tags     : Hash Table, Math, Reservoir Sampling, Randomized
// Link     : https://leetcode.com/problems/random-flip-matrix/
// Runtime  : 23 ms (beats 78%)
// Memory   : 47540000 (beats 16%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    int rows, cols, total;
    Set<Integer> flipped;
    Random rand;

    public Solution(int m, int n) {
        rows = m;
        cols = n;
        total = m * n;
        flipped = new HashSet<>();
        rand = new Random();
    }

    public int[] flip() {
        int x;
        do {
            x = rand.nextInt(total);
        } while (flipped.contains(x));
        flipped.add(x);
        return new int[]{x / cols, x % cols};
    }

    public void reset() {
        flipped.clear();
    }
}
