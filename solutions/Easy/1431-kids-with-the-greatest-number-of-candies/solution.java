// ──────────────────────────────────────────────────
// Problem  : 1431. Kids With the Greatest Number of Candies
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Runtime  : 1 ms (beats 96%)
// Memory   : 43904000 (beats 43%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int c : candies) {
            max = Math.max(max, c);
        }
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }
        
        return result;
    }
}
