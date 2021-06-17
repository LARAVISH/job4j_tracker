package ru.job4j.stream;

public class Person {
    private String name;
    private String surname;
    private int age;
    private  String specialization;
    private double salary;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class Builder{
        private String name;
        private String surname;
        private int age;
        private  String specialization;
        private double salary;

        Builder buildName(String name){
            this.name = name;
            return this;
        }
        Builder buildSurname(String surname){
            this.surname = surname;
            return this;
        }
        Builder buildAge(int age){
            this.age = age;
            return this;
        }
        Builder buildSpecialization(String specialization){
            this.specialization = specialization;
            return this;
        }
        Builder buildSalary(double salary){
            this.salary = salary;
            return this;
        }
        Person build(){
            Person person = new Person();
            person.name = name;
            person.surname = surname;
            person.age = age;
            person.specialization = specialization;
            person.salary = salary;
            return person;
        }

    }

    public static void main(String[] args) {
        Person p1 = new Builder().buildName("Ivan")
                .buildSurname("Ivanov")
                .buildAge(35)
                .buildSalary(1500D)
                .buildSpecialization("teacher")
                .build();
        System.out.println(p1);
        Person p2 = new Builder().buildSurname("Petrov")
                .buildAge(30)
                .buildSpecialization("Doctor")
                .build();
        System.out.println(p2);
        Person p3 = new Builder().buildName("Petr")
                .buildSalary(2900D)
                .build();
        System.out.println(p3);

    }
}
