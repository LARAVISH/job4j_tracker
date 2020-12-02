package ru.job4j.inheritance;

public class Dantist extends Doctor {
    public Dantist(String name, String surname, int patientRecords) {
        super(name, surname, patientRecords);
    }

    public Pacient treatsTeeth(int tooth) {
        return new Pacient();
    }
}

