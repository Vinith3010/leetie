-- ──────────────────────────────────────────────────
-- Problem  : 1407. Top Travellers
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/top-travellers/
-- Runtime  : 869 ms (beats 74%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT 
    u.name,
    IFNULL(SUM(r.distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r
ON u.id = r.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name ASC;
