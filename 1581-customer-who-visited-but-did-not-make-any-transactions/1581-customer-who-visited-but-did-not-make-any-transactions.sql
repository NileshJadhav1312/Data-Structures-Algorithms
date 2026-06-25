SELECT v.customer_id, COUNT(v.customer_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id
ORDER BY count_no_trans ASC;

/*
COUNT(v.customer_id) counts visits without transactions
for each customer and stores result as count_no_trans.

LEFT JOIN + WHERE t.transaction_id IS NULL works as
an Anti Left Join to find visits with no matching transaction.
*/