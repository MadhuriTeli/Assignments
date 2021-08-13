create or replace procedure cal_bonus(eno  number,y number,bonus_sal out number)
as
salary number(7,2);
per number(7,2);
bonus number(7,2); 
begin
select sal into salary 
from emp 
where empno=eno;
dbms_output.put_line('emp salary '||salary);
select amt into per 
from emp_bonus where year=y;
dbms_output.put_line('percent '||per);
bonus:=(salary *per )/100;
dbms_output.put_line('Bonus amt '||bonus);
bonus_sal:=bonus+salary;
dbms_output.put_line('Bonus with salary '||bonus_sal);

insert into emp_month_sal values (eno,bonus_sal,sysdate);

end;
/
