// ──────────────────────────────────────────────────
// Problem  : 556. Next Greater Element III
// Difficulty: Medium
// Tags     : Math, Two Pointers, String
// Link     : https://leetcode.com/problems/next-greater-element-iii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42040000 (beats 59%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        
        // Step 1: find first decreasing digit from right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        if (i < 0) return -1; // no next permutation
        
        // Step 2: find digit just larger than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        
        // Step 4: reverse suffix
        reverse(digits, i + 1, digits.length - 1);
        
        long val = Long.parseLong(new String(digits));
        return (val > Integer.MAX_VALUE) ? -1 : (int) val;
    }
    
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
}
