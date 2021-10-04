package com.app.dto;

import com.app.pojos.Passenger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateReservationRequest {

	private int flightId;
	private Passenger passenger;
	
//	private String passengerFirstName;
//	private String passengerLastName;
//	private String passengerMiddleName;
//	private String passengerEmail;
//	private String passengerPhone;
//	private String cardNumber;
//	private String expirationDate;
//	private String securityCode;

	}
