create database db5;
use db5;
create table emp( Deptno int primary key,ename varchar(10), salary int); 
insert into emp( Deptno ,ename, salary)
values (1 , 'employeeA', 1000),(2 , 'employeeAB', 2000),(3, 'employeeC', 3000),(104, 'employeeD', 4000);
select * from emp;
select count(salary) from emp;
select Max(salary) from emp;
select Min(salary) from emp;
select Sum(salary) from emp;
select Max(salary) as Deptno from emp;
select Min(salary) as Deptno from emp;
select * from emp where salary >= 6900 && 9000;
select Deptno from emp ;
desc emp