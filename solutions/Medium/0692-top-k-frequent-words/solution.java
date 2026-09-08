// ──────────────────────────────────────────────────
// Problem  : 692. Top K Frequent Words
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Trie, Sorting, Heap (Priority Queue), Bucket Sort, Counting
// Link     : https://leetcode.com/problems/top-k-frequent-words/
// Runtime  : 6 ms (beats 100%)
// Memory   : 46708000 (beats 16%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Custom comparator for priority queue
        PriorityQueue<String> pq = new PriorityQueue<>((w1, w2) -> {
            int freqCompare = freqMap.get(w2) - freqMap.get(w1);
            if (freqCompare == 0) {
                return w1.compareTo(w2); // lexicographically smaller first
            }
            return freqCompare;
        });

        pq.addAll(freqMap.keySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        return result;
    }
}
