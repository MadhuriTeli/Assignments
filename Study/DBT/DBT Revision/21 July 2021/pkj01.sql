create or replace package pkg1 as

function calcage(bdate in date) return number;
procedure insdept(dno in number,dnm varchar,lc varchar);


end pkg1;
/

create or replace package body pkg1 as

function calcage(bdate in date) return number as
age number(5,2);
begin

select months_between(sysdate,bdate)/12 into age from dual;

return age;

end calcage;

procedure insdept(dno in number,dnm varchar,lc varchar) as
begin

	insert into dept values(dno,dnm,lc);
	dbms_output.put_line('successfully inserted');
exception
	when dup_VAL_ON_INDEX THEN

		dbms_output.put_line('record already exists');
end insdept;
end pkg1;







