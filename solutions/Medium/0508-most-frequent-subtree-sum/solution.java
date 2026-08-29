// ──────────────────────────────────────────────────
// Problem  : 508. Most Frequent Subtree Sum
// Difficulty: Medium
// Tags     : Hash Table, Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/most-frequent-subtree-sum/
// Runtime  : 4 ms (beats 91%)
// Memory   : 47624000 (beats 32%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    private Map<Integer, Integer> freq;
    private int maxFreq;

    public int[] findFrequentTreeSum(TreeNode root) {
        freq = new HashMap<>();
        maxFreq = 0;
        postOrder(root);

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);
        return ans;
    }

    private int postOrder(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val + postOrder(node.left) + postOrder(node.right);
        freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        maxFreq = Math.max(maxFreq, freq.get(sum));
        return sum;
    }
}
