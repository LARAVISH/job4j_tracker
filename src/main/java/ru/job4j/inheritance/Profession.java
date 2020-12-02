package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthDay;

    public String getName() {
        return name;
    }
}

class Engineer extends Profession {
    public void planning() {
    }
}

class Builder extends Engineer {
    String drawing;

    public void buildHouse() {
    }
}

class Programmer extends Engineer {
    String software;

    public void developsSoftware(String software) {
    }
}

class Doctor extends Profession {
    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}

class Surgeon extends Doctor {
    public Pacient operate(String scalpel) {
        return new Pacient();
    }
}

class Dantist extends Doctor {
    public Pacient treatsTeeth(int tooth) {
        return new Pacient();
    }
}

class Diagnosis {
}

class Pacient {
}
