package com.app.service;

import com.app.dto.CreateReservationRequest;
import com.app.dto.UpdateReservationRequest;
import com.app.pojos.Reservation;

public interface IReservationService {
	Reservation addReservation(CreateReservationRequest request);
	Reservation getReservationDetails(int reservationId);
	Reservation checkIn(UpdateReservationRequest request);
}
