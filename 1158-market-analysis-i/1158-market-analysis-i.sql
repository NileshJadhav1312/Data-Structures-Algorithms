# Write your MySQL query statement below
# Write your MySQL query statement below
select u.user_id as buyer_id,u.join_date,IFNULL(count(order_date),0) as orders_in_2019
from Users u
left join Orders o
on u.user_id=o.buyer_id
AND o.order_date >= '2019-01-01'
  AND o.order_date < '2020-01-01'
GROUP BY u.user_id
 
 