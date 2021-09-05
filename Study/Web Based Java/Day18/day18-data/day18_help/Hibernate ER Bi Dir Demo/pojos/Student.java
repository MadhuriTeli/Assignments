package pojos;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student extends BaseEntity{
	@Column(length = 20)
	private String name;
	@Column(length = 20,unique = true)
	private String email;
	//many to one : def fetching policy = eager , recommendation : LAZY
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id",nullable = false)// to specify name of FK column n adds NOT NULL constraint
	private Course selectedCourse;
	//one to one uni dir association between entity(Student) -------> value type(AdharCard) 
	//how to tell hibernate about the embeddable type
	@Embedded //OPTIONAL : for the understanding purpose
	private AdharCard card;
	//Student HAS-A Hobbies (one to many , uni dir , Student ----> Hobby , type : Collection of  basic value type)
	@ElementCollection //MANDATORY : otherwise : org.hibernate.MappingExc
	//how to specify the name of collection table ?
	@CollectionTable(name = "student_hobbies",
	joinColumns = @JoinColumn(name="student_id"))//optional
	@Column(name="hobby",length = 30)//optional
	private List<String> hobbies=new ArrayList<>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	//all s/g
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	
	public AdharCard getCard() {
		return card;
	}
	public void setCard(AdharCard card) {
		this.card = card;
	}
	
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Student ID "+getId()+" name=" + name + ", email=" + email ;
	}
	
	

}
