declare
  salary emp.sal%type;
  workas emp.job%type;
begin
select sal,job into salary,workas
from emp
where ename='&empname';
	dbms_output.put_line('salary '||salary);
dbms_output.put_line('work as '||workas);
end;
/
