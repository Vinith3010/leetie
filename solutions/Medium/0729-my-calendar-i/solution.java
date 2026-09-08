// ──────────────────────────────────────────────────
// Problem  : 729. My Calendar I
// Difficulty: Medium
// Tags     : Array, Binary Search, Design, Segment Tree, Ordered Set
// Link     : https://leetcode.com/problems/my-calendar-i/
// Runtime  : 84 ms (beats 25%)
// Memory   : 46944000 (beats 90%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class MyCalendar {
    private List<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] b : bookings) {
            if (start < b[1] && end > b[0]) {
                return false; // overlap
            }
        }
        bookings.add(new int[]{start, end});
        return true;
    }
}
