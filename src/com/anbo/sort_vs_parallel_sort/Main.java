package com.anbo.sort_vs_parallel_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by anbo06131 on 10/3/2017.
 */
public class Main {

    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        List<String> values2 = new ArrayList<>(values);

        sequentialSort(values);
        parallelSort(values2);
        //System.out.println(values);
    }

    public static void sequentialSort(List<String> values) {
        long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));

        // sequential sort took: 899 ms
    }

    public static void parallelSort(List<String> values) {
        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));

        // parallel sort took: 472 ms
    }

}
