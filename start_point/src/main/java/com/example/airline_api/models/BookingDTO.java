package com.example.airline_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookingDTO {

    @Id
    private long id;
}