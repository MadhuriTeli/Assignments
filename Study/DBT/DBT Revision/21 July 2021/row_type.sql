declare
  emprec    emp%rowtype;  

begin
select * into emprec
from emp
where ename='&empname';

dbms_output.put_line('employee name '||emprec.ename||'  employee salary '||emprec.sal||'  '||emprec.comm||'  '||emprec.job);

end;
/
