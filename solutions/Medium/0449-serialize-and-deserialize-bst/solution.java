// ──────────────────────────────────────────────────
// Problem  : 449. Serialize and Deserialize BST
// Difficulty: Medium
// Tags     : String, Tree, Depth-First Search, Breadth-First Search, Design, Binary Search Tree, Binary Tree
// Link     : https://leetcode.com/problems/serialize-and-deserialize-bst/
// Runtime  : 4 ms (beats 97%)
// Memory   : 46500000 (beats 96%)
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

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] vals = data.split(",");
        int[] preorder = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            preorder[i] = Integer.parseInt(vals[i]);
        }
        return build(preorder, new int[]{0}, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int[] index, int min, int max) {
        if (index[0] == preorder.length) return null;
        int val = preorder[index[0]];
        if (val < min || val > max) return null;

        TreeNode root = new TreeNode(val);
        index[0]++;
        root.left = build(preorder, index, min, val);
        root.right = build(preorder, index, val, max);
        return root;
    }
}
