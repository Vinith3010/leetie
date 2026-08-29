// ──────────────────────────────────────────────────
// Problem  : 558. Logical OR of Two Binary Grids Represented as Quad-Trees
// Difficulty: Medium
// Tags     : Divide and Conquer, Tree
// Link     : https://leetcode.com/problems/logical-or-of-two-binary-grids-represented-as-quad-trees/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46984000 (beats 65%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1.isLeaf) {
            if (quadTree1.val) return new Node(true, true);
            return quadTree2;
        }
        if (quadTree2.isLeaf) {
            if (quadTree2.val) return new Node(true, true);
            return quadTree1;
        }

        Node topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
        Node topRight = intersect(quadTree1.topRight, quadTree2.topRight);
        Node bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
        Node bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);

        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
            && topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            return new Node(topLeft.val, true);
        }
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}
