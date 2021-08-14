package IacsdStaticExample;

public class Employee {
	int id;
	String name;
	double salary;// instance variable

	static String CEO;
	static String compName;// class variable
	static {
		System.out.println("------static--------");
		CEO = "Rajan";
		compName = "New Vision Ltd";
	}

	public Employee() {

		System.out.println("------constr--------");

	}

	public void display() {
		System.out.println("" + id + "  " + salary + "  " + compName + "  " + CEO);

	}

	public static void showCEO() {
		System.out.println(CEO + "   " + compName);

	}
}
