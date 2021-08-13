package IacsdConstChain;

public class Employee {
	private int bonus;
	private String name;

	public Employee() {
		
		System.out.println("-----default-------");
		bonus = 10000;
		name = "Ram";

	}

	public Employee(String name) {
		this();//calling default constr
		
		System.out.println("-----parameterised-------");

		this.name = name;
		
	}

	void display() {

		System.out.println(name + "    " + bonus);

	}

}
