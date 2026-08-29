// ──────────────────────────────────────────────────
// Problem  : 552. Student Attendance Record II
// Difficulty: Hard
// Tags     : Dynamic Programming
// Link     : https://leetcode.com/problems/student-attendance-record-ii/
// Runtime  : 210 ms (beats 82%)
// Memory   : 207156000 (beats 38%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static final int MOD = 1000000007;

    public int checkRecord(int n) {
        // dp[i][a][l] = number of valid sequences of length i
        // with a absences used and ending with l consecutive L's
        long[][][] dp = new long[n + 1][2][3];
        dp[0][0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int a = 0; a <= 1; a++) {
                for (int l = 0; l <= 2; l++) {
                    long val = dp[i - 1][a][l];
                    if (val == 0) continue;

                    // Add 'P'
                    dp[i][a][0] = (dp[i][a][0] + val) % MOD;

                    // Add 'A'
                    if (a < 1) {
                        dp[i][a + 1][0] = (dp[i][a + 1][0] + val) % MOD;
                    }

                    // Add 'L'
                    if (l < 2) {
                        dp[i][a][l + 1] = (dp[i][a][l + 1] + val) % MOD;
                    }
                }
            }
        }

        long res = 0;
        for (int a = 0; a <= 1; a++) {
            for (int l = 0; l <= 2; l++) {
                res = (res + dp[n][a][l]) % MOD;
            }
        }
        return (int) res;
    }
}
