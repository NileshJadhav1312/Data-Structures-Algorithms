select 'Low Salary' as category ,count(*) as accounts_count from Accounts where income<20000
union all
select 'Average Salary' ,count(*)  from Accounts where income between 20000 and 50000
union all
select 'High Salary' ,count(*)from Accounts where income>50000

-- SELECT
--     'Low Salary' As category
--     ,COUNT(CASE WHEN income<20000 THEN 1 END) AS accounts_count
-- FROM accounts

-- UNION ALL

-- SELECT
--     'Average Salary' AS category
--     ,COUNT(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 END) AS accounts_count
-- FROM accounts

-- UNION ALL

-- SELECT 
--     'High Salary' AS category
--     ,COUNT(CASE WHEN income>50000 THEN 1 END) AS accounts_count
-- FROM accounts