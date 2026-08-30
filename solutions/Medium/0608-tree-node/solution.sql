-- ──────────────────────────────────────────────────
-- Problem  : 608. Tree Node
-- Difficulty: Medium
-- Tags     : Database
-- Link     : https://leetcode.com/problems/tree-node/
-- Runtime  : 526 ms (beats 53%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT id,
       CASE
           WHEN p_id IS NULL THEN 'Root'
           WHEN id NOT IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL) THEN 'Leaf'
           ELSE 'Inner'
       END AS Type
FROM Tree;
