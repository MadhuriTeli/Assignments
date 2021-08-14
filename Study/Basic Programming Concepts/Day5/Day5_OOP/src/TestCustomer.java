import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer cust1=new Customer();
		cust1.acceptInfo();
		cust1.dispInfo();
		System.out.println("-------------------------");
		
		Customer cust2=new Customer();
		cust2.acceptInfo();
		cust2.dispInfo();
		
		System.out.println("Enter New CreditLimit");
		Scanner sc=new Scanner(System.in);
		double c=sc.nextDouble();
		
		cust2.setCreditLimit(c);
		//cust2.dispInfo();
		System.out.println("Updated CreditLimit:"+cust2.getCreditLimit());
	}

}
