// ──────────────────────────────────────────────────
// Problem  : 675. Cut Off Trees for Golf Event
// Difficulty: Hard
// Tags     : Array, Breadth-First Search, Heap (Priority Queue), Matrix
// Link     : https://leetcode.com/problems/cut-off-trees-for-golf-event/
// Runtime  : 381 ms (beats 79%)
// Memory   : 47120000 (beats 79%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int cutOffTree(List<List<Integer>> forest) {
        int m = forest.size(), n = forest.get(0).size();
        List<int[]> trees = new ArrayList<>();
        
        // Collect all trees with height > 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int h = forest.get(i).get(j);
                if (h > 1) {
                    trees.add(new int[]{h, i, j});
                }
            }
        }
        
        // Sort trees by height
        trees.sort((a, b) -> a[0] - b[0]);
        
        int totalSteps = 0;
        int startX = 0, startY = 0;
        
        for (int[] tree : trees) {
            int steps = bfs(forest, startX, startY, tree[1], tree[2]);
            if (steps == -1) return -1;
            totalSteps += steps;
            startX = tree[1];
            startY = tree[2];
        }
        
        return totalSteps;
    }
    
    private int bfs(List<List<Integer>> forest, int sx, int sy, int tx, int ty) {
        if (sx == tx && sy == ty) return 0;
        
        int m = forest.size(), n = forest.get(0).size();
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy, 0});
        visited[sx][sy] = true;
        
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dirs) {
                int nx = cur[0] + d[0], ny = cur[1] + d[1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n 
                    && !visited[nx][ny] && forest.get(nx).get(ny) != 0) {
                    
                    if (nx == tx && ny == ty) return cur[2] + 1;
                    
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, cur[2] + 1});
                }
            }
        }
        
        return -1; // unreachable
    }
}
