package com.anbo.streams_examples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by anbo06131 on 9/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        System.out.println("Filtered collection");
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println); // "aaa2", "aaa1"

        System.out.println("Filtered & sorted collection");
        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);   // "aaa1", "aaa2"

        System.out.println("Sorted collection & uppercase");
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println("Any element start with a: "+anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println("All elements start with a: "+allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println("None stars with z: "+noneStartsWithZ);      // true


        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println("Count elements start with b: "+startsWithB);    // 3

        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);
        System.out.println("Spliting result: ");
        reduced.ifPresent(System.out::println);
        // "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"

        //Stream to List
        List<String> result = stringCollection.stream().collect(Collectors.toList());

    }
}
