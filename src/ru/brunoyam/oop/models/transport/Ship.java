package ru.brunoyam.oop.models.transport;

import java.util.Arrays;

public class Ship extends Transport {

    private Cabin[] cabins;

    public Ship(int travelTime, int seatsNumber, int cost, Cabin[] cabins) {
        super(travelTime, seatsNumber, cost);
        this.cabins = cabins;
    }

    public Cabin[] getCabins() {
        return cabins;
    }

    public void setCabins(Cabin[] cabins) {
        this.cabins = cabins;
    }

    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription+
                "Ship{" +
                "cabins=" + Arrays.toString(cabins) +
                '}';
    }
}
