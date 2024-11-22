use  aspiresys;
-- function
delimiter $$

create function BloodGroup( Emp_Name varchar(100)) returns varchar(30)
deterministic
begin
declare
emp_details varchar(200);
select concat(Emplyee_id,';',Date_of_birth,';',Blood_group) into emp_details from Employees 
where Emp_Name = Emplyee_name;
return emp_details;
end $$
Delimiter ;

drop function BloodGroup;

Select BloodGroup('Priya Reddy');

delimiter $$
create function Salery_SUM() returns int
deterministic
begin
declare
Total_Salerie int;
select sum(Salery) into Total_Salerie from Employees;
return Total_Salerie;
end $$
delimiter ;

select Salery_SUM();

