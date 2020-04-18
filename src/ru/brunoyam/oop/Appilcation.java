package ru.brunoyam.oop;

import ru.brunoyam.oop.models.Passenger;
import ru.brunoyam.oop.models.transport.*;

/**
 * Главный класс нашего приложения.
 */
public class Appilcation {

    /**
     * Главный класс приложения
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {

        Transport[] transports = new Transport[4];
        Passenger[] passengers = new Passenger[4];


        Cabin[] cabins = new Cabin[2];
        cabins[0] = new Cabin(4, "Стандарт");
        cabins[1] = new Cabin(2, "Люкс");

        Compartment[] compartments = new Compartment[3];
        compartments[0] = new Compartment(6, "Плацкарт");
        compartments[1] = new Compartment(4, "Купе");
        compartments[2] = new Compartment(2,"СВ");

        Bus bus = new Bus(true, 15, 180, 40,10000);
        Plane plane = new Plane(180, 100, 100000, true);
        Ship ship = new Ship(480, 6, 50000, cabins);
        Train train = new Train(480, 150, 150000, compartments);

        transports[0] = bus;
        transports[1] = plane;
        transports[2] = ship;
        transports[3] = train;

        passengers[0] = new Passenger("Иван", "Иванов", "Иванович", "1234");
        passengers[1] = new Passenger("Петр", "Петров", "Петрович", "2345");
        passengers[2] = new Passenger("Борис", "Борисов", "Борисович", "3456");
        passengers[3] = new Passenger("Николай", "Николаев", "Николаевич", "4567");


        Passenger[] busPassengers = new Passenger[1];
        busPassengers[0] = passengers[0];
        bus.setPassengers(busPassengers);

        Passenger[] planePassengers = new Passenger[1];
        planePassengers[0] = passengers[1];
        plane.setPassengers(planePassengers);

        Passenger[] cabinPassengers = new Passenger[1];
        cabinPassengers[0] = passengers[2];
        cabins[0].setPassengers(cabinPassengers);

        Passenger[] compartmentPassengers = new Passenger[1];
        compartmentPassengers[0] = passengers[3];
        compartments[0].setPassengers(compartmentPassengers);

        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
        }

    }

}
