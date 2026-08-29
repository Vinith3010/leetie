// ──────────────────────────────────────────────────
// Problem  : 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
// Runtime  : 1 ms (beats 100%)
// Memory   : 53536000 (beats 17%)
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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;
        if (original == target) return cloned;

        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) return left;

        return getTargetCopy(original.right, cloned.right, target);
    }
}
