
public class IacsdEmployee {
private int empid;
private String name;
public IacsdEmployee(int empid, String name) {
	
	this.empid = empid;
	this.name = name;
}



public int getEmpid() {
	return empid;
}



public void setEmpid(int empid) {
	this.empid = empid;
}



public void display()
{
System.out.println("EmpId:"+empid +"   Name:"+name);	
	}


}
