// ──────────────────────────────────────────────────
// Problem  : 481. Magical String
// Difficulty: Medium
// Tags     : Two Pointers, String
// Link     : https://leetcode.com/problems/magical-string/
// Runtime  : 3 ms (beats 100%)
// Memory   : 43944000 (beats 68%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1; // "122" has one '1' in first 3 chars
        
        int[] arr = new int[n + 2]; // extra space
        arr[0] = 1; arr[1] = 2; arr[2] = 2;
        
        int head = 2, tail = 3, num = 1, count = 1;
        
        while (tail < n) {
            for (int i = 0; i < arr[head]; i++) {
                arr[tail] = num;
                if (num == 1 && tail < n) count++;
                tail++;
            }
            num = num ^ 3; // toggle between 1 and 2
            head++;
        }
        return count;
    }
}
