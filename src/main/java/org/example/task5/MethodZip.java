package org.example.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class MethodZip {
    public static void main(String[] args) {
        Stream <Integer> first = Stream.of(1, 3, 5, 7, 9);
        Stream <Integer> second = Stream.of(2, 4, 6, 8);
        Stream <Integer> mixed = zip(first,second);
        System.out.println(mixed.collect(Collectors.toList()));

    }


    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> itrFirst = first.iterator();
        Iterator<T> itrSecond = second.iterator();

        Stream.Builder<T> builder = Stream.builder();
        while (itrFirst.hasNext() && itrSecond.hasNext()) {
            builder.accept(itrFirst.next());
            builder.accept(itrSecond.next());
        }
        return builder.build();
    }
}
