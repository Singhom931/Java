create database db1;
use db1;
create table place(pname varchar(10)); 
insert into place(pname)
values ('Hyderabad');
desc place;
update place set pname = UPPER('Hyderabad');
SUBSTRING (pname, 1, 3)
REPLACE('Hyderabad', 'Hyd', 'Secun');
SELECT CHARINDEX('e', 'Hyderabad') AS MatchPosition;