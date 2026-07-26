# Write your MySQL query statement below
select person_name
 from(
    select person_name,turn,sum(weight) over (order by turn asc) as total from Queue

)b
where b.total<=1000
order by b.turn desc
limit 1;
 