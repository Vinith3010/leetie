// ──────────────────────────────────────────────────
// Problem  : 464. Can I Win
// Difficulty: Medium
// Tags     : Math, Dynamic Programming, Bit Manipulation, Memoization, Game Theory, Bitmask
// Link     : https://leetcode.com/problems/can-i-win/
// Runtime  : 532 ms (beats 16%)
// Memory   : 107740000 (beats 21%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    private Map<Integer, Boolean> memo = new HashMap<>();
    private int desiredTotal;
    private int maxChoosableInteger;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;
        if (desiredTotal <= 0) return true;

        this.desiredTotal = desiredTotal;
        this.maxChoosableInteger = maxChoosableInteger;

        return dfs(0, 0);
    }

    private boolean dfs(int used, int currentTotal) {
        if (memo.containsKey(used)) return memo.get(used);

        for (int i = 1; i <= maxChoosableInteger; i++) {
            int mask = 1 << i;
            if ((used & mask) == 0) {
                if (currentTotal + i >= desiredTotal || !dfs(used | mask, currentTotal + i)) {
                    memo.put(used, true);
                    return true;
                }
            }
        }
        memo.put(used, false);
        return false;
    }
}
