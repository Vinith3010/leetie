// ──────────────────────────────────────────────────
// Problem  : 421. Maximum XOR of Two Numbers in an Array
// Difficulty: Medium
// Tags     : Array, Hash Table, Bit Manipulation, Trie
// Link     : https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
// Runtime  : 937 ms (beats 33%)
// Memory   : 208720000 (beats 54%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    private void insert(TrieNode root, int num) {
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (root.children[bit] == null) {
                root.children[bit] = new TrieNode();
            }
            root = root.children[bit];
        }
    }

    private int query(TrieNode root, int num) {
        int xor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int opposite = bit ^ 1;
            if (root.children[opposite] != null) {
                xor |= (1 << i);
                root = root.children[opposite];
            } else {
                root = root.children[bit];
            }
        }
        return xor;
    }

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        for (int num : nums) {
            insert(root, num);
        }

        int maxXor = 0;
        for (int num : nums) {
            maxXor = Math.max(maxXor, query(root, num));
        }
        return maxXor;
    }
}
