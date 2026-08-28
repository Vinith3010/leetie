// ──────────────────────────────────────────────────
// Problem  : 965. Univalued Binary Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/univalued-binary-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42940000 (beats 61%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return dfs(root, root.val);
    }
    
    private boolean dfs(TreeNode node, int val) {
        if (node == null) return true;
        if (node.val != val) return false;
        return dfs(node.left, val) && dfs(node.right, val);
    }
}
