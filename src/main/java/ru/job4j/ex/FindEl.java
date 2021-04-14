package ru.job4j.ex;

public class FindEl {

    public static void indexOf(String[] value, String key) throws ElementNotFoundException {
        for (String s : value) {
            if (key.equals(s)) {
                break;
            } else {
                throw new ElementNotFoundException("item not found");
            }
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"el1", "el2"}, "el");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
