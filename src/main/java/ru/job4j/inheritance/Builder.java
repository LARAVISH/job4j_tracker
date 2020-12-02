package ru.job4j.inheritance;

public class Builder  extends Profession{
     private String drawing;

    public Builder(String name, String surname, String education, int birthDay, String drawing) {
        super(name, surname, education, birthDay);
        this.drawing = drawing;
    }

    public String getDrawing(){
         return drawing;
     }
     public void setDrawing(String draw){
         drawing = draw;
     }

    public void buildHouse() {
    }
}
