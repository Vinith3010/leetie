// ──────────────────────────────────────────────────
// Problem  : 662. Maximum Width of Binary Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/maximum-width-of-binary-tree/
// Runtime  : 2 ms (beats 42%)
// Memory   : 45324000 (beats 18%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int minIndex = queue.peek().getValue();
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> p = queue.poll();
                TreeNode node = p.getKey();
                int index = p.getValue() - minIndex; // normalize to avoid overflow

                if (i == 0) first = index;
                if (i == size - 1) last = index;

                if (node.left != null) queue.offer(new Pair<>(node.left, 2 * index));
                if (node.right != null) queue.offer(new Pair<>(node.right, 2 * index + 1));
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
        }
        return maxWidth;
    }
}
