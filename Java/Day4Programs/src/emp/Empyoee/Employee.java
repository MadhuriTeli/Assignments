/* 3:Consider that payroll software needs to be developed for computerization of
operations of an ABC organization. The organization has employees.
3.1. Construct a class Employee with following members using private access
specifies:
 Employee Id integer
 Employee Name string
 Basic Salary double
 HRA double
 Medical double
 PF double
PT double
 Net Salary double
 Gross Salary double
Please use following expressions for calculations:
 * HRA = 50% of Basic Salary
* PF = 12% of Basic Salary
* PT = Rs. 200

3.2. Write methods to display the details of an employee and calculate the gross
and net salary.
* Goss Salary = Basic Salary + HRA + Medical
* Net Salary = Gross Salary – (PT + PF)

Create a TestEmployee Class.Create Object of employee class and assign values and display Details.
 */

package emp.Empyoee;
public class Employee {
	private int id;
	private String name;
	private double salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getPt() {
		return pt;
	}
	public void setPt(double pt) {
		this.pt = pt;
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public double calcGrossSal(double salary,double hra,double medical)
	{
		double gross = salary + hra +medical;
		return gross;
	}
	
	public double calcNetSal(double gross, double pt, double pf)
	{
		double net = gross - (pt + pf);
		return net;
	}
	
	public void displayData()
	{
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Basic salary: "+getSalary());
		System.out.println("HRA: "+getHra());
		System.out.println("Medical: "+getMedical());
		System.out.println("Provident Fund: "+getPf());
		System.out.println("Professional Tax: "+getPt());
		System.out.println("Gross Salary: "+getGrossSalary());
		System.out.println("Net Salary: "+getNetSalary());
	}
	
	
}