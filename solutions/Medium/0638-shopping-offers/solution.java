// ──────────────────────────────────────────────────
// Problem  : 638. Shopping Offers
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Backtracking, Bit Manipulation, Memoization, Bitmask, Knapsack Problem, Complete Knapsack
// Link     : https://leetcode.com/problems/shopping-offers/
// Runtime  : 6 ms (beats 85%)
// Memory   : 46524000 (beats 28%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    Map<List<Integer>, Integer> memo = new HashMap<>();

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        if (memo.containsKey(needs)) return memo.get(needs);

        int minCost = directPurchase(price, needs);

        for (List<Integer> offer : special) {
            List<Integer> newNeeds = new ArrayList<>();
            boolean valid = true;
            for (int i = 0; i < needs.size(); i++) {
                if (needs.get(i) < offer.get(i)) {
                    valid = false;
                    break;
                }
                newNeeds.add(needs.get(i) - offer.get(i));
            }
            if (valid) {
                minCost = Math.min(minCost, offer.get(needs.size()) + shoppingOffers(price, special, newNeeds));
            }
        }

        memo.put(needs, minCost);
        return minCost;
    }

    private int directPurchase(List<Integer> price, List<Integer> needs) {
        int cost = 0;
        for (int i = 0; i < needs.size(); i++) {
            cost += price.get(i) * needs.get(i);
        }
        return cost;
    }
}
