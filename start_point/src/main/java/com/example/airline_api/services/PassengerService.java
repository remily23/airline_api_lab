package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.models.PassengerDTO;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Passenger addPassenger(PassengerDTO passengerDTO){
        Passenger passenger = new Passenger(passengerDTO.getName(), passengerDTO.getEmail());

        passengerRepository.save(passenger);
        return passenger;
    }


    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }

    public Optional<Passenger> getPassengersById(Long passengerId){
        return passengerRepository.findById(passengerId);
    }

    public void addPassenger(Passenger passenger) {
    }
}
