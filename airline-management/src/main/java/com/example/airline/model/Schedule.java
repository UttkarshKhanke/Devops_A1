package com.example.airline.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String departureTime;
    private String arrivalTime;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
}
