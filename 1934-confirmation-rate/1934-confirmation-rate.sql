# Write your MySQL query statement below
SELECT s.user_id,                                           -- Select user ID from Signups table
       ROUND(
        IFNULL(
            SUM(c.action = 'confirmed') / COUNT(c.action),
            0
        ),
        2
    ) AS confirmation_rate                               -- Rename output column as confirmation_rate
FROM Signups s                                              -- Signups table with alias 's'
LEFT JOIN Confirmations c                                   -- Join Confirmations table with alias 'c'
ON s.user_id = c.user_id                                    -- Match records using user_id
GROUP BY s.user_id;                                         -- Group data for each user