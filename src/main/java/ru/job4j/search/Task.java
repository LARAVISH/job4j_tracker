package ru.job4j.search;

public class Task {
    private String task;
    private int priority;

    public Task(String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public Object getDesc() {
        return task;
    }
}
