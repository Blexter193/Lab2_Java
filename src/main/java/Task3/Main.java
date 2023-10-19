package Task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane("Boeing 307", 100);
        Plane plane2 = new Plane("Boeing 747", 200);
        Plane plane3 = new Plane("Boeing 777", 300);

        Airport airport1 = new Airport("4393234A","Lviv national airport");
        Airport airport2 = new Airport("4738229B","London national airport");
        Airport airport3 = new Airport("4388922C","Kyiv national airport");

        Passenger passenger1 = new Passenger("Oleksiy", "Babych");
        Passenger passenger2 = new Passenger("Vladyslav", "Mykolenko");
        Passenger passenger3 = new Passenger("Volodymyr", "Petrenko");

        Flight flight1 = new Flight(plane1, "307BOE");
        Flight flight2 = new Flight(plane2, "747BOE");
        Flight flight3 = new Flight(plane3, "777BOE");

        Ticket ticket1 = new Ticket(LocalDate.of(2023, 10, 19), "54BH", flight1, passenger1, 100);
        Ticket ticket2 = new Ticket(LocalDate.of(2024, 10, 19), "55BG", flight2, passenger2, 150);

        LocalDate dateStart = LocalDate.of(2023, 11, 1);
        LocalDate dateEnd = LocalDate.of(2023, 11, 30);

        Airline airline = new Airline();
        airline.addAirport(airport1);
        airline.addAirport(airport2);
        airline.addFlight(flight1);
        airline.addFlight(flight1);
        airline.removeFlight(flight2);
        airline.editFlight(flight1, flight3);
        airline.addTicket(ticket1);
        airline.addTicket(ticket2);

        airline.showAllFlights();
        airline.showPriceForPeriod(dateStart, dateEnd);
    }
}
