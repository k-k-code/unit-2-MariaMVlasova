package ru.brunoyam.oop.models.transport;

import java.util.Arrays;

public class Train extends Transport {

    private Compartment[] compartments;

    public Train(int travelTime, int seatsNumber, int cost, Compartment[] compartments) {
        super(travelTime, seatsNumber, cost);
        this.compartments = compartments;
    }

    public Compartment[] getCompartments() {
        return compartments;
    }

    public void setCompartments(Compartment[] compartments) {
        this.compartments = compartments;
    }

    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription+
                "Train{" +
                "compartments=" + Arrays.toString(compartments) +
                '}';
    }
}
