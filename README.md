# Flight Booking System

## Overview
The **Flight Booking System** is a microservices-based application that streamlines flight management, scheduling, and ticket booking. It is designed to be scalable, efficient, and easy to integrate with external services.

### **Microservices Architecture**
The system consists of three core microservices:

1. **Flight Service** – Handles flight details and routes.
2. **Schedule Service** – Manages flight schedules and seat availability.
3. **Ticket Service** – Facilitates ticket bookings and passenger details.

---

## **Services & API Endpoints**
### **1. Flight Service**  
📍 Port: `5000`  
✈️ Manages flight routes and details.  

| Method | Endpoint | Description |
|--------|---------|-------------|
| GET    | `/flights` | Retrieve a list of all available flights (supports sorting) |
| POST   | `/flights` | Add a new flight to the system |
| GET    | `/flights/{id}` | Fetch details of a specific flight |
| GET    | `/flights/{id}/schedules` | View schedules linked to a flight |
| DELETE | `/flights/{id}` | Remove a flight from the system |

---

### **2. Schedule Service**  
📍 Port: `5001`  
🕒 Manages flight schedules and seat availability.  

| Method | Endpoint | Description |
|--------|---------|-------------|
| GET    | `/schedules?flightId={id}&date={yyyy-MM-dd}` | Retrieve schedules for a flight (filter by date) |
| POST   | `/schedules` | Add a new flight schedule |
| DELETE | `/schedules/{id}` | Remove a schedule from the system |

---

### **3. Ticket Service**  
📍 Port: `5002`  
🎫 Handles passenger ticketing and booking management.  

| Method | Endpoint | Description |
|--------|---------|-------------|
| GET    | `/tickets` | Fetch all booked tickets |
| POST   | `/tickets` | Book a new ticket |
| GET    | `/tickets/{id}` | Retrieve details of a booked ticket |
| DELETE | `/tickets/{id}` | Cancel a booked ticket |

---

## **Technology Stack**
- **Java 17** – Modern and high-performance programming language
- **Spring Boot 3.4.2** – Rapid microservice development framework
- **Lombok** – Reduces boilerplate code
- **Spring Web** – RESTful API development
- **Spring Actuator** – System monitoring and health checks
- **Maven** – Dependency management and project build tool

---

## **Data Models**
### **Flight** ✈️
```yaml
id: String
flightNumber: String
departure: String
destination: String
departureTime: String
```

### **Schedule** 🕒
```yaml
id: String
flightId: String
date: LocalDateTime
availableSeats: int
```

### **Ticket** 🎫
```yaml
id: String
passengerName: String
passengerEmail: String
passengerPhone: String
flightId: String
scheduleId: String
seatNumber: String
price: double
status: TicketStatus (BOOKED, CANCELLED)
```

---

## **Getting Started** 🚀
### **Prerequisites**
- Java 17 installed
- Maven installed (or use the included Maven wrapper)

### **Running the Application**
#### **Start Flight Service**
```sh
cd microservice_flights
./mvnw spring-boot:run
```
#### **Start Schedule Service**
```sh
cd microservice_schedules
./mvnw spring-boot:run
```
#### **Start Ticket Service**
```sh
cd microservice_tickets
./mvnw spring-boot:run
```


