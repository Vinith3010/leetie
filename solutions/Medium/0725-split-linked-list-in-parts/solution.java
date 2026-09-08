// ──────────────────────────────────────────────────
// Problem  : 725. Split Linked List in Parts
// Difficulty: Medium
// Tags     : Linked List
// Link     : https://leetcode.com/problems/split-linked-list-in-parts/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44692000 (beats 93%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        
        // Step 1: Count length
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        
        // Step 2: Compute base size and extra nodes
        int baseSize = length / k;
        int extra = length % k;
        
        // Step 3: Split
        curr = head;
        for (int i = 0; i < k; i++) {
            result[i] = curr;
            int partSize = baseSize + (extra > 0 ? 1 : 0);
            if (extra > 0) extra--;
            
            for (int j = 0; j < partSize - 1 && curr != null; j++) {
                curr = curr.next;
            }
            
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }
        
        return result;
    }
}
