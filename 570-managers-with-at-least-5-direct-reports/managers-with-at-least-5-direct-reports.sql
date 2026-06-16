# Write your MySQL query statement below
select m.name 
from Employee e
join Employee m 
ON e.managerId = m.id
GROUP BY m.id
HAVING COUNT(*) >= 5;
 