// ──────────────────────────────────────────────────
// Problem  : 526. Beautiful Arrangement
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask
// Link     : https://leetcode.com/problems/beautiful-arrangement/
// Runtime  : 40 ms (beats 53%)
// Memory   : 42100000 (beats 59%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int count = 0;

    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        backtrack(n, 1, visited);
        return count;
    }

    private void backtrack(int n, int pos, boolean[] visited) {
        if (pos > n) {
            count++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;
                backtrack(n, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
}
