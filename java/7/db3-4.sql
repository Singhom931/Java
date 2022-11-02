create database db3;
use db3;
create table num(ndouble double); 
insert into num(ndouble)
values(27.456);
SELECT FLOOR(27.456);
SELECT SIGN(27.456);
SELECT ROUND(27.456 , 1) AS RoundValue;
SELECT CEILING(27.456);
SELECT convert(varchar, getdate(), 3)
