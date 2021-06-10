package ru.job4j.function;

import java.util.Objects;

public class Folder {
    private String name;
    private int size;

    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Folder)) return false;
        Folder folder = (Folder) o;
        return getSize() == folder.getSize() && Objects.equals(getName(), folder.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSize());
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
