// ──────────────────────────────────────────────────
// Problem  : 756. Pyramid Transition Matrix
// Difficulty: Medium
// Tags     : Hash Table, String, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/pyramid-transition-matrix/
// Runtime  : 91 ms (beats 75%)
// Memory   : 49596000 (beats 21%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    Map<String, List<Character>> map = new HashMap<>();
    Map<String, Boolean> memo = new HashMap<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for (String s : allowed) {
            String key = s.substring(0, 2);
            char val = s.charAt(2);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(val);
        }
        return dfs(bottom);
    }

    private boolean dfs(String row) {
        if (row.length() == 1) return true;
        if (memo.containsKey(row)) return memo.get(row);

        List<String> nextRows = new ArrayList<>();
        buildNextRows(row, 0, new StringBuilder(), nextRows);

        for (String next : nextRows) {
            if (dfs(next)) {
                memo.put(row, true);
                return true;
            }
        }
        memo.put(row, false);
        return false;
    }

    private void buildNextRows(String row, int idx, StringBuilder sb, List<String> nextRows) {
        if (idx == row.length() - 1) {
            nextRows.add(sb.toString());
            return;
        }
        String key = row.substring(idx, idx + 2);
        if (!map.containsKey(key)) return;
        for (char c : map.get(key)) {
            sb.append(c);
            buildNextRows(row, idx + 1, sb, nextRows);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
