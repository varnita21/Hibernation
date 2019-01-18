create database hibernatedb;
use hibernatedb;

#Employee Table
create table employee(
empId int primary key auto_increment,
empName varchar(30),
empAddress varchar(30),
salary int,
create_at timestamp default CURRENT_TIMESTAMP,
updatedAt timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);
alter table employee 
add column address_id int(20);
describe employee;
alter table employee
add constraint FK_Employee_Addr Foreign key (address_id) references address(id);


#Address Table
create table address(
id int primary key auto_increment,
streetNo varchar(30),
city varchar(20),
createdAt timestamp default CURRENT_TIMESTAMP,
updatedAt timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);



#phone table
create table phone(
id int primary key auto_increment,
number bigint(10)
);

alter table phone
add column employee_id int(10);
 drop table phone;
alter table phone
add constraint FK_Phone_Person foreign key 
phone(employee_id) references employee(empId);
