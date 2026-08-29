// ──────────────────────────────────────────────────
// Problem  : 1507. Reformat Date
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/reformat-date/
// Runtime  : 6 ms (beats 31%)
// Memory   : 43444000 (beats 16%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String day = parts[0].replaceAll("[^0-9]", "");
        if (day.length() == 1) day = "0" + day;

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        return parts[2] + "-" + months.get(parts[1]) + "-" + day;
    }
}
