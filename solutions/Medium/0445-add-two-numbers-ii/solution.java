// ──────────────────────────────────────────────────
// Problem  : 445. Add Two Numbers II
// Difficulty: Medium
// Tags     : Linked List, Math, Stack
// Link     : https://leetcode.com/problems/add-two-numbers-ii/
// Runtime  : 3 ms (beats 41%)
// Memory   : 46548000 (beats 47%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        // Push all digits of l1 into stack
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        
        // Push all digits of l2 into stack
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0;
        ListNode head = null;
        
        // Pop from stacks and add digits
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int x = s1.isEmpty() ? 0 : s1.pop();
            int y = s2.isEmpty() ? 0 : s2.pop();
            
            int sum = x + y + carry;
            carry = sum / 10;
            
            // Create new node and insert at front
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        }
        
        return head;
    }
}
