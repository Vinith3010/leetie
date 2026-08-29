// ──────────────────────────────────────────────────
// Problem  : 1475. Final Prices With a Special Discount in a Shop
// Difficulty: Easy
// Tags     : Array, Stack, Monotonic Stack
// Link     : https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
// Runtime  : 1 ms (beats 100%)
// Memory   : 45424000 (beats 23%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int discount = 0;
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            result[i] = prices[i] - discount;
        }
        
        return result;
    }
}
