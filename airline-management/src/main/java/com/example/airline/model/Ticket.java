package com.example.airline.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String email;
    private LocalDate journeyDate;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
}
