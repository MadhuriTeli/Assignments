import java.util.Scanner;

public class Employee {
	
	private int empid;
	private String name;
	private String add;
	private double salary;
	private double medical;
	
	public Employee()//default constr
	{	
		System.out.println("---invoking default constr----");
	empid=1;
	name="Ram";
	add="Pune";
	salary=10000;
	medical=500;
	//tax;
	//code in default
	
	}
	public Employee(int empid,String name,String add,double salary)
	{
		
		this();//what is this:points to current obj? emp2=new Employee();
		
		System.out.println("---invoking parameterised constr----");
	
		this.empid=empid;
		this.name=name;
		this.add=add;
		this.salary=salary;
		
		
	}
	

	
	
	
	
	
	public void acceptInfo()
	{Scanner sc=new Scanner(System.in);
		System.out.println("Id Name Address Sal");
		empid=sc.nextInt();
		name=sc.next();
		add=sc.next();
		salary=sc.nextDouble();
	}
	
	public void acceptInfo(int id,String nm,String addr,double sal)
	{
		empid=id;//empid=sc.nextInt();
		name=nm;
		add=addr;
		salary=sal;
	}
	public void displayInfo()
	{
		
		System.out.println("EmpId:"+this.empid);
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+add);
		System.out.println("Salary:"+salary);
		System.out.println("Medical:"+medical);
	}

}
