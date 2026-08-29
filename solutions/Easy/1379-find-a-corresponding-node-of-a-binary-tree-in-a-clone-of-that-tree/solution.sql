-- ──────────────────────────────────────────────────
-- Problem  : 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
-- Difficulty: Easy
-- Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
-- Link     : https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
-- Runtime  : 1071 ms (beats 98%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT 
    u.unique_id, 
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI u
ON e.id = u.id;
