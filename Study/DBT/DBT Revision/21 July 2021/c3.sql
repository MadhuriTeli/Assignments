DECLARE
   CURSOR c_cur(dno number) is
      SELECT * 
      FROM emp where deptno=dno;

   c_rec c_cur%rowtype;

dn number:=&dn;

BEGIN
   OPEN c_cur(dn);
DBMS_OUTPUT.put_line('empno' || ' ' || 'ename'|| ' ' || 'deptno');
   LOOP
      FETCH c_cur into c_rec;
      EXIT WHEN c_cur%notfound;
      DBMS_OUTPUT.put_line(c_rec.empno || ' ' || c_rec.ename|| ' ' || c_rec.deptno);
   END LOOP;
close c_cur;
END;
/