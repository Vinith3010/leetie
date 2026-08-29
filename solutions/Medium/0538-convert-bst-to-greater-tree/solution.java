// ──────────────────────────────────────────────────
// Problem  : 538. Convert BST to Greater Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Search Tree, Binary Tree
// Link     : https://leetcode.com/problems/convert-bst-to-greater-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47512000 (beats 24%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        traverse(root);
        return root;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        // Reverse in-order: right → node → left
        traverse(node.right);
        sum += node.val;
        node.val = sum;
        traverse(node.left);
    }
}
