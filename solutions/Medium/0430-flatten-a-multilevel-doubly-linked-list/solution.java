// ──────────────────────────────────────────────────
// Problem  : 430. Flatten a Multilevel Doubly Linked List
// Difficulty: Medium
// Tags     : Linked List, Depth-First Search, Doubly-Linked List
// Link     : https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43328000 (beats 75%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Node dummy = new Node(0, null, head, null);
        Node prev = dummy;
        Stack<Node> stack = new Stack<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null) stack.push(curr.next);
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }

        dummy.next.prev = null;
        return dummy.next;
    }
}
