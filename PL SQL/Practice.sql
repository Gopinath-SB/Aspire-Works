use  aspiresys;
-- Basic quries
select * from employees;
select Emplyee_name,Salery from employees;
select Emplyee_name from employees
where Salery>50000;
select Emplyee_name from employees
where year(Date_of_join) = 2020; 
select * from employees 
where Emplyee_name like "a%";

-- Aggregate function
select avg(Salery) as average_of_employee from employees;
select count(Emplyee_name) as Total_no_of_Employee from employees;
select max(Salery) as Maximum_Salery from employees;
select sum(Salery) as Total_Amount_paid_by_company from employees;
select count(Emplyee_name) as Count_of_employee_in_each_dep from employees group by Departments;

alter table employees add column Departments varchar(200);
SET SQL_SAFE_UPDATES = 0;
update employees set Departments = 'Insurance' 
where Emplyee_id = 101 ;
update employees set Departments = 'Insurance' 
where Emplyee_id = 105; 
update employees set Departments = 'Testing' 
where Emplyee_id = 102; 
update employees set Departments = 'Testing' 
where Emplyee_id = 104; 
update employees set Departments = 'EI' 
where Emplyee_id = 103; 

-- joins


alter table employees drop column Departments;
select * from employees;

alter table employees add column Dept_id int;
update employees set Dept_id = '1001' 
where Emplyee_id = 101 ;
update employees set Dept_id = '1001' 
where Emplyee_id = 105; 
update employees set Dept_id = '1005' 
where Emplyee_id = 102; 
update employees set Dept_id = '1005' 
where Emplyee_id = 104; 
update employees set Dept_id = '1004' 
where Emplyee_id = 103; 
select * from employees;
describe employees;

-- Create Departments table with Dept_id as primary key
CREATE TABLE Departments (
    Dept_id varchar(100) PRIMARY KEY,
    Department_Manger varchar(200) NOT NULL,
    Departments varchar(300) NOT NULL UNIQUE
);
alter table employees
drop column Dept_id;

-- Add Dept_id column in Employees table
ALTER TABLE Employees
ADD COLUMN Dept_id varchar(100);

-- Add foreign key constraint to Employees table
ALTER TABLE Employees
ADD CONSTRAINT FK_Department
FOREIGN KEY (Dept_id)
REFERENCES Departments(Dept_id);

update employees
set Dept_id='D101'
where Emplyee_id = 101;

update employees
set Dept_id='D101'
where Emplyee_id = 105;

update employees
set Dept_id='D102'
where Emplyee_id = 102;

update employees
set Dept_id='D102'
where Emplyee_id = 104;

INSERT INTO Departments 
(Dept_id, Department_Manger, Departments)
VALUES
('D101', 'Ragu','Insurance');

INSERT INTO Departments 
(Dept_id, Department_Manger, Departments)
VALUES
('D103', 'Badhri','Data and Analytics');

update employees
set Dept_id='D103'
where Emplyee_id = 102;

update employees
set Dept_id='D103'
where Emplyee_id = 103;





select * from employees;
select * from Departments;
desc Departments;
desc employees;


-- joins
select employees.Emplyee_name,Departments.Departments
from employees left join Departments on
employees.Dept_id = Departments.Dept_id;

select e1.Emplyee_name,e2.Manger
from employees e1 left Join employees e2
on e1.Emplyee_id = e2.Manger_id;


desc employees;

    
    select * from employees;
    select * from departments;

alter table employees add column Manger_id int;
update employees set Manger_id = 101
where Emplyee_id = 101;
update employees set Manger_id = 102
where Emplyee_id = 102;
update employees set Manger_id = 103
where Emplyee_id = 103;
update employees set Manger_id = 104
where Emplyee_id = 104;
update employees set Manger_id = 104
where Emplyee_id = 105;

select * from employees;
alter table employees drop column Manger_id;


ALTER TABLE Departments
ADD CONSTRAINT FK_Department
FOREIGN KEY (Dept_id)
REFERENCES Projects(Dept_id);

create table Projects(
Project_id varchar(300) primary key,
Project_name varchar(300) not null,
Project_Manager varchar(300) not null unique,
Dept_id varchar(300),
foreign key (Dept_id) references employees(Dept_id)
);

INSERT INTO Projects (Project_id, Project_name, Project_Manager, Dept_id)
VALUES 
('P001', 'Project Alpha', 'Alice', 'D101'),
('P002', 'Project Beta', 'Bob', 'D102'),
('P003', 'Project Gamma', 'Charlie', 'D103'),
('P004', 'Project ROBO', 'Alice', 'D106');



select*from employees;
select*from Projects;

select employees.Emplyee_name
from employees join projects
on employees.Dept_id = Projects.Dept_id 
group by employees.Emplyee_name  having count(distinct Project_name)>1;

select employees.Emplyee_name, projects.Project_name
from employees right join projects
on employees.Dept_id = projects.Dept_id;

-- Subqueries

select Emplyee_name,Salery,
(select max(Salery) from employees group by Salery limit 1 offset 2) as Second_most_salery from employees;

SELECT e1.Emplyee_Name, Avg_Salary.Sal FROM Employees e1 JOIN (
	SELECT Dept_ID, AVG(Salery) AS Sal FROM Employees
    GROUP BY Dept_ID 
) AS Avg_Salary 
ON e1.Dept_ID = Avg_Salary.Dept_ID 
WHERE e1.Salery > Avg_Salary.Sal;

-- set opration
select * from employees;
select*from departments;
select * from projects;

SELECT e.Emplyee_name
FROM employees e
JOIN Departments d ON e.Dept_id = d.Dept_id
WHERE d.Departments IN ('HR', 'Finance');

select e.Desigination,d.Departments
from employees e 
join Departments d on e.Dept_id = d.Dept_id;

select e.emplyee_name,p.Project_name
from employees e 
join Projects p on e.Dept_id = p.Dept_id
where e.emplyee_name not in('Project Alpha','Project Beta','Project Gamma');















