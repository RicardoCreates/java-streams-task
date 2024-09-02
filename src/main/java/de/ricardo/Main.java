package de.ricardo;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //even 1
        System.out.println("even");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //double 2
        System.out.println("\ndouble");
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        //ascending (Aufsteigend) 3
        System.out.println("\nascending");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        //sum 4
        System.out.println("\nsum");
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Summe aller Zahlen: " + sum);

        //all Numbers 5
        System.out.println("\nAllNumbers");
        List<Integer> processedNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Verarbeitete Zahlen: " + processedNumbers);

    }
}