package emp.Empyoee;
import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter Emplyee Id: ");
		emp.setId(sc.nextInt());
		
		System.out.println("Enter Emplyee name: ");
		emp.setName(sc.next());
		
		System.out.println("Enter Basic salary: ");
		emp.setSalary(sc.nextDouble());
		
		System.out.println("Enter Medical: ");
		emp.setMedical(sc.nextDouble());
		
		emp.setHra(0.5 * emp.getSalary());
		
		emp.setPf(0.12 * emp.getSalary());
		
		emp.setPt(200);
		
		emp.setGrossSalary(emp.calcGrossSal(emp.getSalary(), emp.getHra(), emp.getMedical()));
		emp.setNetSalary(emp.calcNetSal(emp.getGrossSalary(), emp.getPf(), emp.getPt()));
		
		emp.displayData();
		sc.close();
	}

}