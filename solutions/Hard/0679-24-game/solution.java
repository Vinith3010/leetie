// ──────────────────────────────────────────────────
// Problem  : 679. 24 Game
// Difficulty: Hard
// Tags     : Array, Math, Backtracking
// Link     : https://leetcode.com/problems/24-game/
// Runtime  : 1 ms (beats 97%)
// Memory   : 44296000 (beats 93%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static final double EPS = 1e-6;
    private static final int TARGET = 24;

    public boolean judgePoint24(int[] cards) {
        double[] nums = new double[cards.length];
        for (int i = 0; i < cards.length; i++) {
            nums[i] = cards[i];
        }
        return dfs(nums);
    }

    private boolean dfs(double[] nums) {
        int n = nums.length;
        if (n == 1) {
            return Math.abs(nums[0] - TARGET) < EPS;
        }

        // Try all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double[] next = new double[n - 1];
                int idx = 0;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        next[idx++] = nums[k];
                    }
                }

                for (double val : compute(nums[i], nums[j])) {
                    next[idx] = val;
                    if (dfs(next)) return true;
                }
            }
        }
        return false;
    }

    private double[] compute(double a, double b) {
        return new double[]{
            a + b,
            a - b,
            b - a,
            a * b,
            b != 0 ? a / b : Double.NaN,
            a != 0 ? b / a : Double.NaN
        };
    }
}
