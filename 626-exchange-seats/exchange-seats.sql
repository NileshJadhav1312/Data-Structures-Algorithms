-- # Write your MySQL query statement below
-- select
-- CASE
--     WHEN id % 2 = 0 THEN id+1
--     ELSE id-1
-- END, student from Seat order by id asc;
SELECT
    CASE
        WHEN id % 2 = 1 AND id+1 IN(SELECT id FROM Seat) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1
        else id
    END AS id,
    student
FROM Seat order by id;