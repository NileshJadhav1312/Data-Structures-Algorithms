# Write your MySQL query statement below
-- Write your PostgreSQL query statement below
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) as `rank`
FROM Scores;