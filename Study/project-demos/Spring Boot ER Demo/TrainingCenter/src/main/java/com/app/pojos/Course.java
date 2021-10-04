package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "course_dtls")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	@Column(length = 30)
	private String name;
	private LocalDate start, end;
    private double fees;	
	private int availableCapacity;
	//Multiple courses can have same faculty
	@ManyToOne
	@JoinColumn(name = "faculty_id")
	private Faculty courseFaculty;
	//one to one association between entity n embeddable
	@Embedded
	private FeedBack courseFeedBack=new FeedBack();
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
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getAvailableCapacity() {
		return availableCapacity;
	}
	public void setAvailableCapacity(int availableCapacity) {
		this.availableCapacity = availableCapacity;
	}
	public Faculty getCourseFaculty() {
		return courseFaculty;
	}
	public void setCourseFaculty(Faculty courseFaculty) {
		this.courseFaculty = courseFaculty;
	}
	
	public FeedBack getCourseFeedBack() {
		return courseFeedBack;
	}
	public void setCourseFeedBack(FeedBack courseFeedBack) {
		this.courseFeedBack = courseFeedBack;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", start=" + start + ", end=" + end + ", fees=" + fees
				+ ", availableCapacity=" + availableCapacity + "]";
	}
	
	

}
