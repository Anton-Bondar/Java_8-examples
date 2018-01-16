package com.anbo.optional_example;

import java.util.Optional;

/**
 * Created by anbo06131 on 9/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        System.out.println(optional.isPresent());           // true
        System.out.println(optional.get());                 // "bam"
        System.out.println(optional.orElse("fallback"));    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}
