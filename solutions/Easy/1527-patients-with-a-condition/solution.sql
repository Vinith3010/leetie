-- ──────────────────────────────────────────────────
-- Problem  : 1527. Patients With a Condition
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/patients-with-a-condition/
-- Runtime  : 479 ms (beats 34%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT *
FROM Patients
WHERE conditions LIKE 'DIAB1%'
   OR conditions LIKE '% DIAB1%';
