import java.util.Scanner;

public class Student {
	//data members//description//attribute
	private int rollno;
	private String name;
	private int total;
	public Student()
	{
		
	}
	public Student(int rollno,String name,int total)
	{
		
		this.rollno=rollno;
		this.name=name;
		this.total=total;
	}
	public void  acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" RollNo Name  Total");
		int r = sc.nextInt();// rollno

		String nm = sc.next();// name

		int tot = sc.nextInt();// total

		this.rollno=r;
		this.name=nm;
		this.total=tot;
	}
	public void display()
	{
		System.out.println("  "+rollno+   "  "+name +"    "+total);
		
	}
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

	//read and write  attriburtes
	
	
	
}
