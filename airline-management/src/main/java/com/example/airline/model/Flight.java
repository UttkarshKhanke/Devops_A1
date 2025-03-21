package com.example.airline.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private String airline;
    private String source;
    private String destination;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Schedule> schedules;
}
