use  aspiresys;
-- procedure
DELIMITER $$
CREATE PROCEDURE EmpSalary(in emp_name varchar(100))
Begin
select Salery from Employees where emp_name = Emplyee_name;
end $$
DElimiter ;

call EmpSalary('Arun Kumar');

delimiter $$
create procedure Blood(in Emp_id int)
begin
select Blood_group from Employees where Emp_id = Emplyee_id;
end $$
delimiter ;

drop procedure Blood;

call Blood(102);
