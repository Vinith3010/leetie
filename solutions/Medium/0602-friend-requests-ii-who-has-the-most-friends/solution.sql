-- ──────────────────────────────────────────────────
-- Problem  : 602. Friend Requests II: Who Has the Most Friends
-- Difficulty: Medium
-- Tags     : Database
-- Link     : https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
-- Runtime  : 342 ms (beats 52%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Vinith3010. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

SELECT id, COUNT(*) AS num
FROM (
    SELECT requester_id AS id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id FROM RequestAccepted
) AS all_ids
GROUP BY id
ORDER BY num DESC
LIMIT 1;
