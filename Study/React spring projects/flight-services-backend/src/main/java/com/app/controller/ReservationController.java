package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CreateReservationRequest;
import com.app.dto.UpdateReservationRequest;
import com.app.service.IReservationService;

@RestController
@RequestMapping("/reservations")
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:3001"})
public class ReservationController {

	@Autowired
	private IReservationService reservationService;

	@PostMapping
	public ResponseEntity<?> saveReservation(@RequestBody @Valid CreateReservationRequest request) {
		System.out.println("Save Reservation" + request.getFlightId());
		System.out.println(request.getPassenger());
		return ResponseEntity.status(HttpStatus.CREATED).body(reservationService.addReservation(request));
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findReservation(@PathVariable("id") int id) {
		return ResponseEntity.ok(reservationService.getReservationDetails(id));

	}

	@PutMapping
	public ResponseEntity<?> updateReservation(@RequestBody UpdateReservationRequest request) {
		System.out.println("update reservation "+request);
		return ResponseEntity.ok(reservationService.checkIn(request));
	}

}
