// ──────────────────────────────────────────────────
// Problem  : 513. Find Bottom Left Tree Value
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/find-bottom-left-tree-value/
// Runtime  : 3 ms (beats 65%)
// Memory   : 46648000 (beats 29%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = root.val;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans = queue.peek().val; // first node of this level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return ans;
    }
}
