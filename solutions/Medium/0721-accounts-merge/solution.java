// ──────────────────────────────────────────────────
// Problem  : 721. Accounts Merge
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Depth-First Search, Breadth-First Search, Union-Find, Sorting
// Link     : https://leetcode.com/problems/accounts-merge/
// Runtime  : 36 ms (beats 34%)
// Memory   : 50504000 (beats 22%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();

        // Build graph
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                graph.putIfAbsent(email, new ArrayList<>());
                if (i == 1) continue;
                // Connect with previous email
                String prev = account.get(i - 1);
                graph.get(email).add(prev);
                graph.get(prev).add(email);
            }
        }

        // DFS to find connected components
        Set<String> visited = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        for (String email : graph.keySet()) {
            if (!visited.contains(email)) {
                List<String> component = new ArrayList<>();
                dfs(email, graph, visited, component);
                Collections.sort(component);
                component.add(0, emailToName.get(email));
                result.add(component);
            }
        }
        return result;
    }

    private void dfs(String email, Map<String, List<String>> graph, Set<String> visited, List<String> component) {
        visited.add(email);
        component.add(email);
        for (String neighbor : graph.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }
}
