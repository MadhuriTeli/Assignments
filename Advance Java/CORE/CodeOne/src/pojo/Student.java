package pojo;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable{

	private int id;
	private String name;
	private int age;
	private LocalDate regDate;
	private List<String> courses;
	
	static int count;
	
	static {
		count = 0;
	}
	
	Student(){
		System.out.println("In Student Constr::");
		courses = new ArrayList<>();
	}




	
	public Student(String name, int age, LocalDate regDate, List<String> courses) {
		super();
		count++;
		this.id = count;
		this.name = name;
		this.age = age;
		this.regDate = regDate;
		this.courses = courses;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", regDate=" + regDate + ", courses=" + courses
				+ "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
}
