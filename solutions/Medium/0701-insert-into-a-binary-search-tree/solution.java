// ──────────────────────────────────────────────────
// Problem  : 701. Insert into a Binary Search Tree
// Difficulty: Medium
// Tags     : Tree, Binary Search Tree, Binary Tree
// Link     : https://leetcode.com/problems/insert-into-a-binary-search-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47220000 (beats 13%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
