package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.FlightDTO;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

//    public void addFlight(Flight flight){
//        flightRepository.save(flight);
//    }

    public Flight addNewFlight(Flight flight){
        flightRepository.save(flight);
        return flight;
    }

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long id){
        return flightRepository.findById(id).get();
    }

    public void deleteFlight(Long id){
        flightRepository.deleteById(id);
    }

    public void addPassengerToFlight(Long passengerId, Long flightId){
        Flight flight = flightRepository.findById(flightId).get();
//        int capacity = flight.getCapacity();
//        int currentCapacity = flightRepository.calculatePassengerFlights
        Passenger passenger = passengerRepository.findById(passengerId).get();
        passenger.addFlight(flight);
        passengerRepository.save(passenger);
    }

    }
