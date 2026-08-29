// ──────────────────────────────────────────────────
// Problem  : 457. Circular Array Loop
// Difficulty: Medium
// Tags     : Array, Hash Table, Two Pointers, Floyd's Cycle Finding Algorithm
// Link     : https://leetcode.com/problems/circular-array-loop/
// Runtime  : 21 ms (beats 28%)
// Memory   : 42660000 (beats 85%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int slow = i, fast = i;
            boolean forward = nums[i] > 0; // direction
            
            while (true) {
                slow = nextIndex(nums, forward, slow);
                if (slow == -1) break;
                
                fast = nextIndex(nums, forward, fast);
                if (fast == -1) break;
                fast = nextIndex(nums, forward, fast);
                if (fast == -1) break;
                
                if (slow == fast) return true;
            }
        }
        return false;
    }
    
    private int nextIndex(int[] nums, boolean forward, int current) {
        boolean direction = nums[current] > 0;
        if (direction != forward) return -1; // direction changed
        
        int n = nums.length;
        int next = ((current + nums[current]) % n + n) % n; // wrap around
        
        if (next == current) return -1; // one-element loop not valid
        return next;
    }
}
