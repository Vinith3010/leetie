// ──────────────────────────────────────────────────
// Problem  : 478. Generate Random Point in a Circle
// Difficulty: Medium
// Tags     : Math, Geometry, Rejection Sampling, Randomized
// Link     : https://leetcode.com/problems/generate-random-point-in-a-circle/
// Runtime  : 212 ms (beats 48%)
// Memory   : 56492000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    private double radius;
    private double x_center;
    private double y_center;
    private Random rand;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
        this.rand = new Random();
    }

    public double[] randPoint() {
        double r = Math.sqrt(rand.nextDouble()) * radius;
        double theta = rand.nextDouble() * 2 * Math.PI;
        double x = x_center + r * Math.cos(theta);
        double y = y_center + r * Math.sin(theta);
        return new double[]{x, y};
    }
}
