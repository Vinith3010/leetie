// ──────────────────────────────────────────────────
// Problem  : 623. Add One Row to Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/add-one-row-to-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46456000 (beats 80%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        return dfs(root, val, depth, 1);
    }

    private TreeNode dfs(TreeNode node, int val, int depth, int level) {
        if (node == null) return null;
        if (level == depth - 1) {
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);
            left.left = node.left;
            right.right = node.right;
            node.left = left;
            node.right = right;
        } else {
            dfs(node.left, val, depth, level + 1);
            dfs(node.right, val, depth, level + 1);
        }
        return node;
    }
}
