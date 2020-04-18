package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Compartment {

    private int seatsNumber;
    private String compartmentClass;

    private Passenger[] passengers;

    public Compartment(int seatsNumber, String compartmentClass) {
        this.seatsNumber = seatsNumber;
        this.compartmentClass = compartmentClass;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getCompartmentClass() {
        return compartmentClass;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Compartment{" +
                "seatsNumber=" + seatsNumber +
                ", compartmentClass='" + compartmentClass + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
