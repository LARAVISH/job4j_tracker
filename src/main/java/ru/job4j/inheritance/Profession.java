package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthDay;

    public String getName() {
        return name;
    }
    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }
    public Profession(){

    }
    public Profession(String name){
       this(name,null,null,0);
    }
    public Profession(String name,String surname){
        this(name,surname,null,0);
    }
    public Profession(String name,String surname,String education){
    this(name,surname,education,0);
    }
    public Profession(String name,String surname,String education,int birthDay){
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthDay = birthDay;
    }

}



