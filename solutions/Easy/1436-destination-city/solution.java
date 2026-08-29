// ──────────────────────────────────────────────────
// Problem  : 1436. Destination City
// Difficulty: Easy
// Tags     : Array, Hash Table, String
// Link     : https://leetcode.com/problems/destination-city/
// Runtime  : 2 ms (beats 100%)
// Memory   : 45360000 (beats 13%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> starts = new HashSet<>();
        for (List<String> path : paths) {
            starts.add(path.get(0));
        }
        for (List<String> path : paths) {
            String city = path.get(1);
            if (!starts.contains(city)) {
                return city;
            }
        }
        return "";
    }
}
