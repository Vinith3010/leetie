// ──────────────────────────────────────────────────
// Problem  : 690. Employee Importance
// Difficulty: Medium
// Tags     : Array, Hash Table, Tree, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/employee-importance/
// Runtime  : 3 ms (beats 46%)
// Memory   : 47940000 (beats 61%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/*
// Employee info
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        // Map for quick lookup
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return dfs(map, id);
    }

    private int dfs(Map<Integer, Employee> map, int id) {
        Employee e = map.get(id);
        int total = e.importance;
        for (int subId : e.subordinates) {
            total += dfs(map, subId);
        }
        return total;
    }
}
