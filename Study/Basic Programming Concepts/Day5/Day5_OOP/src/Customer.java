import java.util.Scanner;

public class Customer {

	private int custid;
	private String name;
	private double creditlimit;
	
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Cust Id: Name  creditLimit");;
		custid=sc.nextInt();//
		name=sc.next();//
		creditlimit=sc.nextDouble();
		
		
		
	}
	
	
	public void setCreditLimit(double newCredit)
	{
		
		creditlimit=newCredit;//
	}
	public double getCreditLimit()
	{
		return creditlimit;
	}
	
public void dispInfo()
	{
		
		System.out.println(" Name:"+name +"  CreditLimit:"+creditlimit);
		
		
	}
	
}
