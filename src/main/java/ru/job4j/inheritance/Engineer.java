package ru.job4j.inheritance;

public class Engineer extends Profession {
   private int project;

    public Engineer(String name, String surname, String education, int project) {
        super(name, surname, education);
        this.project = project;
    }

    public int getProject(){
       return project;
   }

    public void planning() {
    }
}
