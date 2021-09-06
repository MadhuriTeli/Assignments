package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "advertisements")
public class Advertisement extends BaseEntity{
	@Column(name = "product", length = 50)
	private String product;
	@Column(name = "date_of_tele_cast")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfTeleCast;
	@Column(length = 20)
	private String status;
	@Column(length = 20)
	private String brand;
	
	public Advertisement() {
		// TODO Auto-generated constructor stub
	}

	public Advertisement(String product, LocalDate dateOfTeleCast, String status, String brand) {
		super();
		this.product = product;
		this.dateOfTeleCast = dateOfTeleCast;
		this.status = status;
		this.brand=brand;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public LocalDate getDateOfTeleCast() {
		return dateOfTeleCast;
	}

	public void setDateOfTeleCast(LocalDate dateOfTeleCast) {
		this.dateOfTeleCast = dateOfTeleCast;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Advertisement [product=" + product + ", dateOfTeleCast=" + dateOfTeleCast + ", status=" + status
				+ ", brand=" + brand + ", getId()=" + getId() + "]";
	}

	
	
	
}
