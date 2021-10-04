package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.FlightRepository;
import com.app.pojos.Flight;

@RestController
@RequestMapping("/flights")
@CrossOrigin(origins = "http://localhost:3000")
public class FlightController {

	@Autowired
	FlightRepository flightRepository;

	@GetMapping("/{from}/{to}/{departureDate}")
	public ResponseEntity<?> findFlights(@PathVariable String from, @PathVariable String to,
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate departureDate) {
		return ResponseEntity.ok(flightRepository.findFlights(from, to, departureDate));
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findFlight(@PathVariable("id") int id) {
		return ResponseEntity
				.ok(flightRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Flight Id")));
	}

}
