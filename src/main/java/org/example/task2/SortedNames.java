package org.example.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedNames {
    public static void main(String[] args) {
        List<String> names = List.of("Avian", "Peter", "John", "Michael", "Zahara");
        System.out.println(getSortedNames(names));
    }


    public static List<String> getSortedNames(List<String> names){
        List<String> stringList = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return stringList;

    }
}
