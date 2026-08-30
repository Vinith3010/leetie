// ──────────────────────────────────────────────────
// Problem  : 652. Find Duplicate Subtrees
// Difficulty: Medium
// Tags     : Hash Table, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/find-duplicate-subtrees/
// Runtime  : 18 ms (beats 21%)
// Memory   : 58384000 (beats 54%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    Map<String, Integer> count = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return result;
    }

    private String serialize(TreeNode node) {
        if (node == null) return "#";
        String serial = node.val + "," + serialize(node.left) + "," + serialize(node.right);
        int freq = count.getOrDefault(serial, 0);
        if (freq == 1) result.add(node);
        count.put(serial, freq + 1);
        return serial;
    }
}
