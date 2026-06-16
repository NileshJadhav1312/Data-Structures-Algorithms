# Write your MySQL query statement below
select e.name,b.bonus
FROM Employee e
LEFT JOIN Bonus b
on e.empID=b.empId
where b.bonus<1000 OR b.bonus is null; 
 