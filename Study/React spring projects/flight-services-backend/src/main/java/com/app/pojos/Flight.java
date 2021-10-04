package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "flights")
@Getter
@Setter
public class Flight extends BaseEntity {
	@Column(length = 30,unique = true)
	private String flightNumber;
	@Column(length = 30)
	private String operatingAirlines;
	@Column(length = 30)
	private String departureCity;
	@Column(length = 30)
	private String arrivalCity;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate departureDate;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime departureTime;
	private double fare;

}
