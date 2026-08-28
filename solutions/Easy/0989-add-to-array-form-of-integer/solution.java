// ──────────────────────────────────────────────────
// Problem  : 989. Add to Array-Form of Integer
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/add-to-array-form-of-integer/
// Runtime  : 2 ms (beats 99%)
// Memory   : 48100000 (beats 12%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;
        
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.addFirst(k % 10);
            k /= 10;
        }
        
        return result;
    }
}
