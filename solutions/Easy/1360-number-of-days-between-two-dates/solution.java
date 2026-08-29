// ──────────────────────────────────────────────────
// Problem  : 1360. Number of Days Between Two Dates
// Difficulty: Easy
// Tags     : Math, String
// Link     : https://leetcode.com/problems/number-of-days-between-two-dates/
// Runtime  : 9 ms (beats 16%)
// Memory   : 43796000 (beats 11%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse(date1, formatter);
        LocalDate d2 = LocalDate.parse(date2, formatter);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
