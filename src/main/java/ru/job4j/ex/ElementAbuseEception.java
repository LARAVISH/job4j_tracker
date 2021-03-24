package ru.job4j.ex;

public class ElementAbuseEception extends ElementNotFoundException {
    public ElementAbuseEception(String message) {
        super(message);
    }
}
