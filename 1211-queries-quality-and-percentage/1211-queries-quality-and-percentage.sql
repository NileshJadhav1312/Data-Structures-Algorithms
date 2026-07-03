SELECT 
    query_name,                                                        -- Select query name
    ROUND(
        SUM(rating / position) / COUNT(query_name),                    -- Quality formula
        2
    ) AS quality,                                                      -- Rename as quality
    
    ROUND(
        SUM(rating < 3) * 100 / COUNT(query_name),                     -- Poor queries percentage
        2
    ) AS poor_query_percentage                                         -- Rename output column
    
FROM Queries                                                           -- Queries table
GROUP BY query_name;                                                   -- Group by query name