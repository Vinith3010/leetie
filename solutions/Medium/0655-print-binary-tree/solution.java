// ──────────────────────────────────────────────────
// Problem  : 655. Print Binary Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/print-binary-tree/
// Runtime  : 1 ms (beats 100%)
// Memory   : 44900000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        int width = (int)Math.pow(2, height) - 1;
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            List<String> row = new ArrayList<>(Collections.nCopies(width, ""));
            res.add(row);
        }
        fill(res, root, 0, 0, width - 1);
        return res;
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private void fill(List<List<String>> res, TreeNode node, int row, int left, int right) {
        if (node == null) return;
        int mid = (left + right) / 2;
        res.get(row).set(mid, String.valueOf(node.val));
        fill(res, node.left, row + 1, left, mid - 1);
        fill(res, node.right, row + 1, mid + 1, right);
    }
}
