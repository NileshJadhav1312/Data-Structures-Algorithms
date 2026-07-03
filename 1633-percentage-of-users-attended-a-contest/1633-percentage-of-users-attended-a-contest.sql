SELECT 
    r.contest_id,                                                      -- Select contest ID
    ROUND(
        COUNT(r.user_id) * 100 / (SELECT COUNT(*) FROM Users),         -- Users in contest ÷ total users × 100
        2
    ) AS percentage                                                    -- Rename result column
FROM Register r                                                        -- Register table with alias 'r'
GROUP BY r.contest_id                                                  -- Group by contest
ORDER BY percentage DESC, r.contest_id ASC;                            -- Sort percentage desc, contest id asc