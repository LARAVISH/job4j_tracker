package ru.job4j.pojo;


import java.util.Objects;

public class License {

    private String code;

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        License license = (License) o;
        return Objects.equals(code, license.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
