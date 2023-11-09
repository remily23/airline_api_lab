package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight flight1 = new Flight("Paris", 100, "19-11-2023", "12:00");
        flightRepository.save(flight1);

        Flight flight2 = new Flight("London", 150, "21-11-2023", "14:00");
        flightRepository.save(flight2);

        Passenger passenger1 = new Passenger("Emily", "emily@gmail.com");
        passengerRepository.save(passenger1);

        Passenger passenger2 = new Passenger("Grogu", "grogu@gmail.com");
        passengerRepository.save(passenger2);
    }

}
