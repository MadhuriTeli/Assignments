package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.FlightHandlingException;
import com.app.dao.FlightRepository;
import com.app.dao.PassengerRepository;
import com.app.dao.ReservationRepository;
import com.app.dto.CreateReservationRequest;
import com.app.dto.UpdateReservationRequest;
import com.app.pojos.Flight;
import com.app.pojos.Passenger;
import com.app.pojos.Reservation;

@Service
@Transactional
public class ReservationServiceImpl implements IReservationService {
	@Autowired
	private PassengerRepository passengerRepo;

	@Autowired
	private ReservationRepository reservationRepo;

	@Autowired
	private FlightRepository flightRepo;

	@Override
	public Reservation addReservation(CreateReservationRequest request) {
//		Passenger passenger = new Passenger();
//		passenger.setFirstName(request.getPassengerFirstName());
//		passenger.setLastName(request.getPassengerLastName());
//		passenger.setMiddleName(request.getPassengerMiddleName());
//		passenger.setEmail(request.getPassengerEmail());
//		passenger.setPhone(request.getPassengerPhone());
//
		Flight flight = flightRepo.findById(request.getFlightId())
				.orElseThrow(() -> new FlightHandlingException("Invalid Flight ID!!"));
		Passenger savedPassenger = passengerRepo.save(request.getPassenger());

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		return reservationRepo.save(reservation);

	}

	@Override
	public Reservation getReservationDetails(int reservationId) {
		// TODO Auto-generated method stub
		return reservationRepo.findById(reservationId)
				.orElseThrow(() -> new RuntimeException("Reservation ID Invalid !!"));
	}

	@Override
	public Reservation checkIn(UpdateReservationRequest request) {
		Reservation reservation = reservationRepo.findById(request.getId())
				.orElseThrow(() -> new RuntimeException("Reservation ID Invalid for Check In !!"));
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.isCheckIn());
		return reservationRepo.save(reservation);
	}

}
