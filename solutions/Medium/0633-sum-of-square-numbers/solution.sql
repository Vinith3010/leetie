-- ──────────────────────────────────────────────────
-- Problem  : 633. Sum of Square Numbers
-- Difficulty: Medium
-- Tags     : Math, Two Pointers, Binary Search
-- Link     : https://leetcode.com/problems/sum-of-square-numbers/
-- Runtime  : 431 ms (beats 24%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT 
    CASE 
        WHEN id % 2 = 1 AND id + 1 <= (SELECT COUNT(*) FROM Seat) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1
        ELSE id
    END AS id,
    student
FROM Seat
ORDER BY id;
