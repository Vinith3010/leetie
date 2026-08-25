// ──────────────────────────────────────────────────
// Problem  : 404. Sum of Left Leaves
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/sum-of-left-leaves/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43588000 (beats 13%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean isLeft) {
        if (node == null) return 0;

        // If it's a leaf
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }

        // Recurse on children
        return dfs(node.left, true) + dfs(node.right, false);
    }
}
