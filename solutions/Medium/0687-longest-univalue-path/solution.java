// ──────────────────────────────────────────────────
// Problem  : 687. Longest Univalue Path
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/longest-univalue-path/
// Runtime  : 2 ms (beats 98%)
// Memory   : 50092000 (beats 65%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftPath = 0, rightPath = 0;

        if (node.left != null && node.left.val == node.val) {
            leftPath = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            rightPath = right + 1;
        }

        // Update global max with combined path
        max = Math.max(max, leftPath + rightPath);

        // Return longest single path
        return Math.max(leftPath, rightPath);
    }
}
