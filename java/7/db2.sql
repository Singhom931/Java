create database db1;
use db1;
create table cal(cdate varchar(10),cday varchar(10)); 
insert into cal(cdate,cday)
values('15-sep-20');

SELECT WEEK('2020/9/15');
SELECT YEAR('2020/9/15');
SELECT DATEADD(month, 3, '2020/9/15') AS DateAdd;
SELECT DATEDIFF(year, '2020/9/15', GETDATE()) AS DateDiff;
