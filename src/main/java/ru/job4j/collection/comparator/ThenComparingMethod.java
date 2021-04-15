package ru.job4j.collection.comparator;

import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {
    public static class User implements Comparable<User> {

        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            return this.name.compareTo(o.getName());
        }
    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    public static Comparator<User> ascByName() {
        return (User::compareTo);
        }

    public static Comparator<User> descByAge() {
        return (Comparator.reverseOrder());
    }

}

