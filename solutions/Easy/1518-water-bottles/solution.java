// ──────────────────────────────────────────────────
// Problem  : 1518. Water Bottles
// Difficulty: Easy
// Tags     : Math, Simulation
// Link     : https://leetcode.com/problems/water-bottles/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41908000 (beats 75%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = newBottles + (empty % numExchange);
        }

        return total;
    }
}
