use  aspiresys;
CREATE VIEW Senior_Employee AS
SELECT * 
FROM Employees
ORDER BY Date_of_join
limit 1;

select * from Senior_Employee;