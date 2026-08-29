// ──────────────────────────────────────────────────
// Problem  : 460. LFU Cache
// Difficulty: Hard
// Tags     : Hash Table, Linked List, Design, Doubly-Linked List
// Link     : https://leetcode.com/problems/lfu-cache/
// Runtime  : 70 ms (beats 27%)
// Memory   : 137660000 (beats 34%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class LFUCache {
    private final int capacity;
    private int minFreq;
    private Map<Integer, Node> nodeMap;
    private Map<Integer, LinkedHashSet<Node>> freqMap;
    
    private static class Node {
        int key, value, freq;
        Node(int k, int v) {
            key = k;
            value = v;
            freq = 1;
        }
    }
    
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.nodeMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        if (!nodeMap.containsKey(key)) return -1;
        Node node = nodeMap.get(key);
        updateFreq(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (capacity == 0) return;
        
        if (nodeMap.containsKey(key)) {
            Node node = nodeMap.get(key);
            node.value = value;
            updateFreq(node);
        } else {
            if (nodeMap.size() == capacity) {
                // Evict LFU node
                LinkedHashSet<Node> minSet = freqMap.get(minFreq);
                Node evict = minSet.iterator().next();
                minSet.remove(evict);
                nodeMap.remove(evict.key);
            }
            Node newNode = new Node(key, value);
            nodeMap.put(key, newNode);
            freqMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
            minFreq = 1;
        }
    }
    
    private void updateFreq(Node node) {
        int freq = node.freq;
        LinkedHashSet<Node> set = freqMap.get(freq);
        set.remove(node);
        if (freq == minFreq && set.isEmpty()) {
            minFreq++;
        }
        node.freq++;
        freqMap.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(node);
    }
}
