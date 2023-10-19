package Task3;

import java.time.LocalDate;

public class Ticket {
    private LocalDate date;
    private String ticketNumber;
    private Flight flight;
    private Passenger passenger;
    private double price;

    public Ticket(LocalDate date, String ticketNumber, Flight flight, Passenger passenger, double price) {
        this.date = date;
        this.ticketNumber = ticketNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
