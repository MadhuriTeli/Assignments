package pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course extends BaseEntity{
	@Column(length = 30,unique = true)
	private String title;
	@Temporal(TemporalType.DATE)//col type=date 
	@Column(name="start_date")
	private Date startDate;
	@Temporal(TemporalType.DATE)//col type=date 
	@Column(name="end_date")
	private Date endDate;
	private double fees;
	private int capacity;
	//one to many , bi dir association between 2 entities(Course 1<---->* Student)
	//mappedBy : mandatory in bi dir asso.
	//MUST appear in the inverse side of the asso.
	//value of mappedBy = name of the asso property , as it appears in owning side
	@OneToMany(mappedBy = "selectedCourse", cascade = CascadeType.ALL,orphanRemoval = true/* ,fetch = FetchType.EAGER */)
	private List<Student> students=new ArrayList<>();//students ---> AL (size=0;init capa=10)
	public Course() {
		System.out.println("in course ctor");
	}
	public Course(String title, Date startDate, Date endDate, double fees, int capacity) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.capacity = capacity;
	}
	//ALL getters n setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course ID "+getId()+" title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", fees=" + fees
				+ ", capacity=" + capacity ;
	}
	//helper methods recommended in case of bi-dir asso : for establishing n removing a bi dir link
	public void addStudent(Student s)
	{
		students.add(s);
		s.setSelectedCourse(this);
	}
	public void removeStudent(Student s)
	{
		students.remove(s);
		s.setSelectedCourse(null);
	}	
}
