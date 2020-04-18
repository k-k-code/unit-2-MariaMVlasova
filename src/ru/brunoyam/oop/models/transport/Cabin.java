package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Cabin {
    private int seatsNumber;
    private String cabinClass;

    private Passenger[] passengers;

    public Cabin(int seatsNumber, String cabinClass) {
        this.seatsNumber = seatsNumber;
        this.cabinClass = cabinClass;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Cabin{" +
                "seatsNumber=" + seatsNumber +
                ", cabinClass='" + cabinClass + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
