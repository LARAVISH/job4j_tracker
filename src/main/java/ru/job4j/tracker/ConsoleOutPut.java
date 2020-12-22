package ru.job4j.tracker;

public class ConsoleOutPut implements OutPut {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
