// ──────────────────────────────────────────────────
// Problem  : 993. Cousins in Binary Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/cousins-in-binary-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43172000 (beats 60%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        return dfs(root, null, 0, x).depth == dfs(root, null, 0, y).depth &&
               dfs(root, null, 0, x).parent != dfs(root, null, 0, y).parent;
    }
    
    private NodeInfo dfs(TreeNode node, TreeNode parent, int depth, int target) {
        if (node == null) return null;
        if (node.val == target) return new NodeInfo(parent, depth);
        
        NodeInfo left = dfs(node.left, node, depth + 1, target);
        if (left != null) return left;
        
        return dfs(node.right, node, depth + 1, target);
    }
    
    private static class NodeInfo {
        TreeNode parent;
        int depth;
        NodeInfo(TreeNode p, int d) {
            parent = p;
            depth = d;
        }
    }
}
