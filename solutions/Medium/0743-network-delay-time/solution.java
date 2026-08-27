// ──────────────────────────────────────────────────
// Problem  : 743. Network Delay Time
// Difficulty: Medium
// Tags     : Depth-First Search, Breadth-First Search, Graph Theory, Heap (Priority Queue), Shortest Path, Dijkstra's Algorithm
// Link     : https://leetcode.com/problems/network-delay-time/
// Runtime  : 17 ms (beats 20%)
// Memory   : 49364000 (beats 35%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] time : times) {
            adj.computeIfAbsent(time[0], x -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // [dist, node]
        pq.offer(new int[]{0, k});

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], u = curr[1];

            if (d > dist[u]) continue;

            if (adj.containsKey(u)) {
                for (int[] neighbor : adj.get(u)) {
                    int v = neighbor[0], weight = neighbor[1];
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.offer(new int[]{dist[v], v});
                    }
                }
            }
        }

        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}
    