package pojos;
import javax.persistence.*;

@Entity
@Table(name="student_adr")
public class Address extends BaseEntity {
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String country;
	// one to one uni dir asso between the entities (Student 1<-----1Address)
	@OneToOne
	@JoinColumn(name="student_id")
	@MapsId//to tell hibernate : use shared PK approach (single col will act as PK n FK referring to student id)
	private Student currentStudent;
	public Address() {
		System.out.println("in adr ctor");
	}
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	//all setters n getters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student getCurrentStudent() {
		return currentStudent;
	}
	public void setCurrentStudent(Student currentStudent) {
		this.currentStudent = currentStudent;
	}
	@Override
	public String toString() {
		return "Address ID "+currentStudent.getId()+"  [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	

}
