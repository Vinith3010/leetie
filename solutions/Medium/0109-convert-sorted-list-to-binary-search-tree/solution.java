// ──────────────────────────────────────────────────
// Problem  : 109. Convert Sorted List to Binary Search Tree
// Difficulty: Medium
// Tags     : Linked List, Divide and Conquer, Tree, Binary Search Tree, Binary Tree
// Link     : https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46520000 (beats 94%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return new TreeNode(head.val);
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode res=new TreeNode(slow.next.val);
        ListNode righthalf=slow.next.next;
        slow.next=null;
        res.left=sortedListToBST(head);
        res.right=sortedListToBST(righthalf);
        return res;
    }
}