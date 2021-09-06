package pojo;

public class Student {
	private int id;
	private String name;
	private String address;
	private String course;
	private double fees;
	private int marks;
	
	public Student(int id,String name, String address, String course, double fees, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}


	public Student(String name, String address, String course, double fees, int marks) {
		super();
		this.name = name;
		this.address = address;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}

	
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", fees=" + fees
				+ ", marks=" + marks + "]";
	}
	
	
	
	
}
