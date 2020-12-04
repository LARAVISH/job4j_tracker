package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Vladimir");
        student1.setSurname("Ivanov");
        student1.setGroup(1);
        student1.setDate("1.09.20");
        System.out.println("Студент :  Фамилия Имя - " + student1.getSurname() + " "+ student1.getName() + ". Группа : " + student1.getGroup() + ". Дата зачисления : " + student1.getDateOfEnrollment());
    }
}
