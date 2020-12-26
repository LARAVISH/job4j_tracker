package ru.job4j.ex;

public class FindEl {
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            } else {
                throw new ElementNotFoundException("item not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"el1", "el2"}, "el");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
