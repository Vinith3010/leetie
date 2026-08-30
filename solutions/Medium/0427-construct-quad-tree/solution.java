// ──────────────────────────────────────────────────
// Problem  : 427. Construct Quad Tree
// Difficulty: Medium
// Tags     : Array, Divide and Conquer, Tree, Matrix
// Link     : https://leetcode.com/problems/construct-quad-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46992000 (beats 12%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public Node construct(int[][] grid) {
        return build(grid, 0, 0, grid.length);
    }

    private Node build(int[][] grid, int row, int col, int size) {
        if (size == 1) {
            return new Node(grid[row][col] == 1, true);
        }

        int half = size / 2;
        Node topLeft = build(grid, row, col, half);
        Node topRight = build(grid, row, col + half, half);
        Node bottomLeft = build(grid, row + half, col, half);
        Node bottomRight = build(grid, row + half, col + half, half);

        // If all four children are leaves with the same value, merge them
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
            topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            return new Node(topLeft.val, true);
        }

        Node node = new Node(true, false);
        node.topLeft = topLeft;
        node.topRight = topRight;
        node.bottomLeft = bottomLeft;
        node.bottomRight = bottomRight;
        return node;
    }
}
