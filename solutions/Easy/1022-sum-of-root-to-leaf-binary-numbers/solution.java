// ──────────────────────────────────────────────────
// Problem  : 1022. Sum of Root To Leaf Binary Numbers
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43576000 (beats 82%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int current) {
        if (node == null) return 0;
        
        current = (current << 1) | node.val;
        
        if (node.left == null && node.right == null) {
            return current; // leaf reached
        }
        
        return dfs(node.left, current) + dfs(node.right, current);
    }
}
