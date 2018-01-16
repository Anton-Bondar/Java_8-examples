package com.anbo.predicates;

import com.anbo.static_method_interface.CheckNull;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by anbo06131 on 10/3/2017.
 */
public class Main {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        System.out.println(nonNull.negate().test(null));
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
