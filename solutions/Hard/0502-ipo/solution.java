// ──────────────────────────────────────────────────
// Problem  : 502. IPO
// Difficulty: Hard
// Tags     : Array, Greedy, Sorting, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/ipo/
// Runtime  : 87 ms (beats 95%)
// Memory   : 135864000 (beats 31%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static class Project {
        int capital;
        int profit;

        Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<Project> projects = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            projects.add(new Project(capital[i], profits[i]));
        }

        Collections.sort(projects, (a, b) -> a.capital - b.capital);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> y - x);
        int i = 0;

         
        for (int j = 0; j < k; j++) {
            
            while (i < n && projects.get(i).capital <= w) {
                maxHeap.add(projects.get(i).profit);
                i++;
            }

            
            if (maxHeap.isEmpty()) {
                break;
            }

            
            w += maxHeap.poll();
        }

        return w;
    }
}