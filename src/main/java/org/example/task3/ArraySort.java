package org.example.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySort {
    public static void main(String[] args) {
        String[] intArray = {"1, 2, 0", "4, 5"};
        List<Integer> sortedList = getArraySort(intArray);
        System.out.println(sortedList);
    }
    public static List<Integer> getArraySort(String[] intArray) {
        return Arrays.stream(intArray)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }
}
