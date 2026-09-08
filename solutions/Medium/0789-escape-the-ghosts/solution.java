// ──────────────────────────────────────────────────
// Problem  : 789. Escape The Ghosts
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/escape-the-ghosts/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43944000 (beats 73%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int playerDist = Math.abs(target[0]) + Math.abs(target[1]);
        for (int[] g : ghosts) {
            int ghostDist = Math.abs(g[0] - target[0]) + Math.abs(g[1] - target[1]);
            if (ghostDist <= playerDist) return false;
        }
        return true;
    }
}
