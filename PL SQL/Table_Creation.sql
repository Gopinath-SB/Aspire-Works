create database aspiresys;
use  aspiresys;
create table Employees(
Emplyee_id int(30),
Emplyee_name varchar(30),
Date_of_birth date,
Blood_group varchar(10),
Date_of_join date,
Desigination varchar(30),
Manager varchar(30),
Salery float,
Address varchar(100),
Location varchar(50),
Pincode int
);

INSERT INTO Employees 
(Emplyee_id, Emplyee_name, Date_of_birth, Blood_group, Date_of_join, Desigination, Manager, Salery, Address, Location, Pincode)
VALUES
(101, 'Arun Kumar', '1990-06-15', 'O+', '2020-01-20', 'Software Engineer', 'Neha Sharma', 55000.00, '1234 MG Road, Bangalore', 'Bangalore', 560001);

INSERT INTO Employees 
(Emplyee_id, Emplyee_name, Date_of_birth, Blood_group, Date_of_join, Desigination, Manager, Salery, Address, Location, Pincode)
VALUES
(102, 'Priya Reddy', '1985-11-10', 'A-', '2018-03-12', 'Project Manager', 'Arun Kumar', 75000.00, '4321 Indira Nagar, Hyderabad', 'Hyderabad', 500038);

INSERT INTO Employees
(Emplyee_id, Emplyee_name, Date_of_birth, Blood_group, Date_of_join, Desigination, Manager, Salery, Address, Location, Pincode)
VALUES
(103, 'Ravi Patel', '1992-05-25', 'B+', '2021-07-01', 'HR Manager', 'Priya Reddy', 65000.00, '8765 Juhu Beach, Mumbai', 'Mumbai', 400049);

INSERT INTO Employees
(Emplyee_id, Emplyee_name, Date_of_birth, Blood_group, Date_of_join, Desigination, Manager, Salery, Address, Location, Pincode)
VALUES
(104, 'Suman Gupta', '1988-02-20', 'AB+', '2019-09-15', 'Marketing Specialist', 'Ravi Patel', 48000.00, '2345 Salt Lake, Kolkata', 'Kolkata', 700091);

INSERT INTO Employees 
(Emplyee_id, Emplyee_name, Date_of_birth, Blood_group, Date_of_join, Desigination, Manager, Salery, Address, Location, Pincode)
VALUES
(105, 'Vikram Singh', '1994-07-30', 'O-', '2022-05-10', 'Software Developer', 'Arun Kumar', 60000.00, '6543 Civil Lines, Delhi', 'Delhi', 110054);

select * from Employees;






