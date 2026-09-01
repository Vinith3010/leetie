// ──────────────────────────────────────────────────
// Problem  : 677. Map Sum Pairs
// Difficulty: Medium
// Tags     : Hash Table, String, Design, Trie
// Link     : https://leetcode.com/problems/map-sum-pairs/
// Runtime  : 10 ms (beats 23%)
// Memory   : 44300000 (beats 6%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class MapSum {
    private class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        int sum = 0;
    }
    
    private TrieNode root;
    private Map<String, Integer> map;

    public MapSum() {
        root = new TrieNode();
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        
        TrieNode node = root;
        for (char c : key.toCharArray()) {
            node = node.children.computeIfAbsent(c, k -> new TrieNode());
            node.sum += delta;
        }
    }

    public int sum(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) return 0;
            node = node.children.get(c);
        }
        return node.sum;
    }
}
