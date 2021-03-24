package ru.job4j.strategy;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " ---- " + ln
                + "|    |" + ln
                + " ____ " + ln;
    }
}
