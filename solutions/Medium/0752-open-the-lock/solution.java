// ──────────────────────────────────────────────────
// Problem  : 752. Open the Lock
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Breadth-First Search, Bidirectional Search
// Link     : https://leetcode.com/problems/open-the-lock/
// Runtime  : 85 ms (beats 78%)
// Memory   : 50528000 (beats 31%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains("0000")) return -1;

        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                if (curr.equals(target)) return steps;
                if (dead.contains(curr)) continue;

                for (String next : neighbors(curr)) {
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private List<String> neighbors(String s) {
        List<String> res = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < 4; i++) {
            char c = chars[i];
            // turn wheel up
            chars[i] = c == '9' ? '0' : (char)(c + 1);
            res.add(new String(chars));
            // turn wheel down
            chars[i] = c == '0' ? '9' : (char)(c - 1);
            res.add(new String(chars));
            // reset
            chars[i] = c;
        }
        return res;
    }
}
