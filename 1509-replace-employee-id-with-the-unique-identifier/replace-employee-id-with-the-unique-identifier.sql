SELECT b.unique_id, a.name
FROM Employees a
LEFT JOIN EmployeeUNI b
ON b.id = a.id;

/*
SELECT b.unique_id, a.name
- b.unique_id → Retrieves the employee's unique identifier
- a.name → Retrieves employee name

FROM Employees a
- Employees table is used as the main table
- 'a' is an alias (short name) for Employees

LEFT JOIN EmployeeUNI b
- LEFT JOIN returns all rows from the left table (Employees)
- Matching rows are taken from EmployeeUNI
- If no match exists, NULL is returned

ON b.id = a.id
- Defines the joining condition
- Connects both tables using employee id

Why LEFT JOIN?
- Some employees may not have a unique_id
- LEFT JOIN ensures all employees appear in output
 
*/