DECLARE
   CURSOR c1
	is
      SELECT * 
      FROM emp;

   c_rec c1%rowtype;

BEGIN
   OPEN c1;

for x in 1..5 LOOP
      FETCH c1 into c_rec;
      EXIT WHEN c1%notfound;

      DBMS_OUTPUT.put_line(c_rec.empno || ' ' || c_rec.ename|| ' ' || c_rec.job|| ' ' || c_rec.sal||' yearly sal '||c_rec.sal*12||'  '||c_rec.deptno);

   END LOOP;
close c_cur;
END;
/