package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Downtown");
    }

    @Override
    public void passenger(int countPassengers) {
        double costOfTicket = 1.7;
        double total = countPassengers * costOfTicket;
        System.out.println("Выручка  : " + total);
    }

    @Override
    public double fillUp(int fuel) {
        double fuelPricePerLiter = 0.61;
        return fuelPricePerLiter * fuel;
    }
}
