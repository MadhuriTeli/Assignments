
package FirstCustomerPackage;
import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c1= new Customer();
		Customer c2= new Customer();
	
		System.out.println("\nCustomer1 Details:");
		c1.acceptData();
		c1.displayData();
		System.out.println("\nCustomer2 Details:");
		c2.acceptData();
		c2.displayData();
		
		System.out.println("Enter new Credit Limit");
		double creditL = sc.nextDouble();
		c2.setCreditLimit(creditL);
	
		System.out.println("\nCredit changed...");
		c2.displayData();
		sc.close();
	}	
}
