-- ──────────────────────────────────────────────────
-- Problem  : 1484. Group Sold Products By The Date
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/group-sold-products-by-the-date/
-- Runtime  : 454 ms (beats 81%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT 
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product ORDER BY product) AS products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date;
