SELECT p.project_id,                                                -- Select project ID
       ROUND(SUM(e.experience_years) / COUNT(project_id), 2)        -- Total experience years ÷ total employees, rounded to 2 decimals
       AS average_years                                              -- Rename result column as average_years
FROM Project p                                                       -- Project table with alias 'p'
JOIN Employee e                                                      -- Join Employee table with alias 'e'
ON p.employee_id = e.employee_id                                     -- Match employee IDs from both tables
GROUP BY project_id;                                                 -- Group rows by project_id