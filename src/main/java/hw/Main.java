package main.java.hw;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {

    final static List<String> names = Arrays.asList("Ivan", "Peter", "Oleh", "Sergey", "Viktor", "Vitaliy");
    final static List<String> digits = Arrays.asList("1, 2, 0", "4, 5", "3, 11");

    public static void main(String[] args) {
        System.out.println("Inputs:");
        System.out.println("List of names: " + names);
        System.out.println("List of digits: " + digits);
        System.out.println("-".repeat(15));

        System.out.println("Exercise1: Return string of names with odd index from the list: Names");
        System.out.println(Exercise1.filteredListNames(names));
        System.out.println("-".repeat(15));

        System.out.println("Exercise2: Return names in the upper case from the list: Names");
        System.out.println(Exercise2.modifiedListOfNames(names));
        System.out.println("-".repeat(15));

        System.out.println("Exercise3: Return all numbers sorted by ASC and split by comma from the list: Digits");
        System.out.println(Exercise3.sortedAllNumbersList(digits));
        System.out.println("-".repeat(15));

        System.out.println("Exercise4: Endless random generator number by using Stream.iterate");
        System.out.println(Exercise4.random(0L, 25214903917L, 11, (long) Math.pow(2, 48)));
        System.out.println("-".repeat(15));

        System.out.println("Exercise5: Return all shuffled elements from both streams(Names, Digits) into one & stop once elements end up from any stream");
        System.out.println(Exercise5.zip(names.stream(), digits.stream()).collect(toList()));
    }
}

