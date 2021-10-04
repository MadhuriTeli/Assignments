package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservations")
@Getter
@Setter
public class Reservation extends BaseEntity {
//Since needed a separate reservation id , which is not shared with PK of either user id or passenger id
	// @MapsId is not used here.
	private boolean checkedIn;
	private int numberOfBags;
	// uni dir relationship between entities : Flight <---- Reservation
	@OneToOne
	private Flight flight;
	// uni dir relationship between entities : Passenger <---- Reservation
	@OneToOne
	private Passenger passenger;

}
