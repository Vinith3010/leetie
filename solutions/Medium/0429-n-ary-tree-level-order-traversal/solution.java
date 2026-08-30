// ──────────────────────────────────────────────────
// Problem  : 429. N-ary Tree Level Order Traversal
// Difficulty: Medium
// Tags     : Tree, Breadth-First Search
// Link     : https://leetcode.com/problems/n-ary-tree-level-order-traversal/
// Runtime  : 3 ms (beats 93%)
// Memory   : 46840000 (beats 17%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.val);
                for (Node child : node.children) {
                    queue.offer(child);
                }
            }
            result.add(level);
        }
        return result;
    }
}
