package ru.job4j.collection;

public class Task {
    private String number;

    public String getNumber() {
        return number;
    }

    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }
}
