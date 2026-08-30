// ──────────────────────────────────────────────────
// Problem  : 640. Solve the Equation
// Difficulty: Medium
// Tags     : Math, String, Simulation, Linear Algebra
// Link     : https://leetcode.com/problems/solve-the-equation/
// Runtime  : 2 ms (beats 28%)
// Memory   : 42696000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] left = evaluate(parts[0]);
        int[] right = evaluate(parts[1]);

        int coeff = left[0] - right[0];
        int constTerm = right[1] - left[1];

        if (coeff == 0) {
            if (constTerm == 0) return "Infinite solutions";
            else return "No solution";
        }
        return "x=" + constTerm / coeff;
    }

    private int[] evaluate(String expr) {
        int coeff = 0, constTerm = 0;
        String[] tokens = expr.replace("-", "+-").split("\\+");
        for (String token : tokens) {
            if (token.equals("")) continue;
            if (token.contains("x")) {
                String num = token.replace("x", "");
                coeff += (num.equals("") || num.equals("+")) ? 1 :
                         (num.equals("-")) ? -1 : Integer.parseInt(num);
            } else {
                constTerm += Integer.parseInt(token);
            }
        }
        return new int[]{coeff, constTerm};
    }
}
