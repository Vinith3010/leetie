// ──────────────────────────────────────────────────
// Problem  : 1046. Last Stone Weight
// Difficulty: Easy
// Tags     : Array, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/last-stone-weight/
// Runtime  : 2 ms (beats 32%)
// Memory   : 42896000 (beats 52%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        
        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (y != x) {
                maxHeap.add(y - x);
            }
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
