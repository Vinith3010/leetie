// ──────────────────────────────────────────────────
// Problem  : 731. My Calendar II
// Difficulty: Medium
// Tags     : Array, Binary Search, Design, Segment Tree, Prefix Sum, Ordered Set
// Link     : https://leetcode.com/problems/my-calendar-ii/
// Runtime  : 57 ms (beats 53%)
// Memory   : 47360000 (beats 57%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class MyCalendarTwo {
    private List<int[]> bookings;
    private List<int[]> overlaps;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        // Check against existing overlaps
        for (int[] o : overlaps) {
            if (start < o[1] && end > o[0]) {
                return false; // triple booking
            }
        }

        // Check against existing bookings
        for (int[] b : bookings) {
            if (start < b[1] && end > b[0]) {
                // overlap region
                overlaps.add(new int[]{Math.max(start, b[0]), Math.min(end, b[1])});
            }
        }

        bookings.add(new int[]{start, end});
        return true;
    }
}
