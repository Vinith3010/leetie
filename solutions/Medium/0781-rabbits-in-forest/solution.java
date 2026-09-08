// ──────────────────────────────────────────────────
// Problem  : 781. Rabbits in Forest
// Difficulty: Medium
// Tags     : Array, Hash Table, Math, Greedy
// Link     : https://leetcode.com/problems/rabbits-in-forest/
// Runtime  : 3 ms (beats 87%)
// Memory   : 44292000 (beats 24%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : answers) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int count = entry.getValue();
            int groupSize = x + 1;
            int groups = (count + groupSize - 1) / groupSize; // ceil division
            result += groups * groupSize;
        }
        return result;
    }
}
