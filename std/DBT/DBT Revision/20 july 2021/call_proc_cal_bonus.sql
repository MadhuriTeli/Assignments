   declare
    salary_bonus number(7,2);
    begin
    cal_bonus(&empno,2021,salary_bonus);
    dbms_output.put_line(salary_bonus);
	
	
   end;
   /