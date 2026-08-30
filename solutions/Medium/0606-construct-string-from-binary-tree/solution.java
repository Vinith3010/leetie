// ──────────────────────────────────────────────────
// Problem  : 606. Construct String from Binary Tree
// Difficulty: Medium
// Tags     : String, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/construct-string-from-binary-tree/
// Runtime  : 12 ms (beats 7%)
// Memory   : 53052000 (beats 18%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        if (root.left == null && root.right == null) return String.valueOf(root.val);
        if (root.right == null) return root.val + "(" + tree2str(root.left) + ")";
        return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
    }
}
