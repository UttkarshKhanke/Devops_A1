package com.example.honors_spring_devops.dto;

import lombok.*;

@Data
@Builder (toBuilder = true)
@AllArgsConstructor // Required for Jackson deserialization
@NoArgsConstructor
@Getter
public class FlightInfo {
    public String id;
    public String flightNumber;
    public String departure;
    public String destination;
    public String departureTime;
}