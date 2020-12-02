package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    public Surgeon(String name, String surname, int patientRecords) {
        super(name, surname, patientRecords);
    }

    public Pacient operate() {
        return new Pacient();
    }
}

