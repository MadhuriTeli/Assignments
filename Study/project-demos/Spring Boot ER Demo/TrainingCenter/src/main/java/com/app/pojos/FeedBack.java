package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FeedBack {
	@Column(nullable = true)
	private double startCourse, midCourse, endCourse;
	private boolean status1,status2,status3;
	public double getStartCourse() {
		return startCourse;
	}
	public void setStartCourse(double startCourse) {
		this.startCourse = startCourse;
	}
	public double getMidCourse() {
		return midCourse;
	}
	public void setMidCourse(double midCourse) {
		this.midCourse = midCourse;
	}
	public double getEndCourse() {
		return endCourse;
	}
	public void setEndCourse(double endCourse) {
		this.endCourse = endCourse;
	}
	public boolean isStatus1() {
		return status1;
	}
	public void setStatus1(boolean status1) {
		this.status1 = status1;
	}
	public boolean isStatus2() {
		return status2;
	}
	public void setStatus2(boolean status2) {
		this.status2 = status2;
	}
	public boolean isStatus3() {
		return status3;
	}
	public void setStatus3(boolean status3) {
		this.status3 = status3;
	}
	
}
