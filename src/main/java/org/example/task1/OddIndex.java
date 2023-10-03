package org.example.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndex {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "John", "Michael", "Sarah");
        System.out.println(getOddIndexedNames(names));
    }

    public static String getOddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
