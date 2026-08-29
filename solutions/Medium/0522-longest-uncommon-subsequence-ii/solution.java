// ──────────────────────────────────────────────────
// Problem  : 522. Longest Uncommon Subsequence II
// Difficulty: Medium
// Tags     : Array, Hash Table, Two Pointers, String, Sorting
// Link     : https://leetcode.com/problems/longest-uncommon-subsequence-ii/
// Runtime  : 1 ms (beats 100%)
// Memory   : 42956000 (beats 29%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int findLUSlength(String[] strs) {
        int n = strs.length;
        int ans = -1;
        
        for (int i = 0; i < n; i++) {
            boolean uncommon = true;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (isSubsequence(strs[i], strs[j])) {
                    uncommon = false;
                    break;
                }
            }
            if (uncommon) {
                ans = Math.max(ans, strs[i].length());
            }
        }
        return ans;
    }
    
    private boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) i++;
            j++;
        }
        return i == a.length();
    }
}
