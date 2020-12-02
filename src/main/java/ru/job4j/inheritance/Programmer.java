package ru.job4j.inheritance;

public class Programmer extends Engineer {
  private   String software;

    public Programmer(String name, String surname, String education, int project, String software) {
        super(name, surname, education, project);
        this.software = software;
    }

    public String getSoftware(){
      return software;
  }
  public void setSoftware(String software){
      this.software = software;
  }

    public void developsSoftware(String software) {
    }
}
