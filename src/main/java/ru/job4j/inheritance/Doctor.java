package ru.job4j.inheritance;

public class Doctor extends Profession {
   private int patientRecords;

    public Doctor(String name, String surname, int patientRecords) {
        super(name, surname);
        this.patientRecords = patientRecords;
    }

    public int getPatientRecords(){
       return patientRecords;
   }
   public void setPatientRecords(int records){
       patientRecords = records;
   }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
