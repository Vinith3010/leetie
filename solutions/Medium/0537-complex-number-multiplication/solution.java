// ──────────────────────────────────────────────────
// Problem  : 537. Complex Number Multiplication
// Difficulty: Medium
// Tags     : Math, String, Simulation
// Link     : https://leetcode.com/problems/complex-number-multiplication/
// Runtime  : 3 ms (beats 59%)
// Memory   : 42976000 (beats 46%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+");
        String[] b = num2.split("\\+");
        
        int aReal = Integer.parseInt(a[0]);
        int aImag = Integer.parseInt(a[1].replace("i", ""));
        int bReal = Integer.parseInt(b[0]);
        int bImag = Integer.parseInt(b[1].replace("i", ""));
        
        int real = aReal * bReal - aImag * bImag;
        int imag = aReal * bImag + aImag * bReal;
        
        return real + "+" + imag + "i";
    }
}
