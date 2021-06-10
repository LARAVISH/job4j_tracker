package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    public boolean check(Predicate<String> stringPredicate, String s) {
        return stringPredicate.test(s);
    }

    public String transForm(Function<String, String> stringFunction, String s) {
        return stringFunction.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(usage.check(String::isEmpty, ""));

        System.out.println("Результат работы : " + usage.check(s -> s.startsWith("Fu"), "Function interface"));

        System.out.println("Результат работы : " + usage.check(s -> s.contains("Function"), "Function interface"));

        System.out.println( usage.transForm(String::toUpperCase, "Function interface"));

        System.out.println(usage.transForm(s -> s.concat("работает корректно."),"Строка после преобразования:"));
        System.out.println(usage.transForm(String::trim,"  aBC dEfghK Lmnp RstU     "));

    }
}
