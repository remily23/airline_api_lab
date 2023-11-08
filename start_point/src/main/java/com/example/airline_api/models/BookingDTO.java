package com.example.airline_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class BookingDTO {

    private Long passengerId;
    private long flightId;

    public BookingDTO() {
    }

    public BookingDTO(Long passengerId, long flightId) {
        this.passengerId = passengerId;
        this.flightId = flightId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

}
