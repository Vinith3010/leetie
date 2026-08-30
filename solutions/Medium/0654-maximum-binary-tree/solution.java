// ──────────────────────────────────────────────────
// Problem  : 654. Maximum Binary Tree
// Difficulty: Medium
// Tags     : Array, Divide and Conquer, Stack, Tree, Monotonic Stack, Binary Tree, Cartesian Tree
// Link     : https://leetcode.com/problems/maximum-binary-tree/
// Runtime  : 2 ms (beats 72%)
// Memory   : 46940000 (beats 51%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left == right) return null;
        int maxIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = build(nums, left, maxIndex);
        root.right = build(nums, maxIndex + 1, right);
        return root;
    }
}
