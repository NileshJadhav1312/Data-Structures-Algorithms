# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales s
LEFT JOIN Product p
ON s.product_id = p.product_id;

/*
Gets product name from Product table and year, price from Sales table.

LEFT JOIN connects both tables using product_id and keeps all rows from Sales table.
*/