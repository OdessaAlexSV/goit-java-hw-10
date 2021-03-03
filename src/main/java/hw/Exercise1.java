package main.java.hw;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Метод принимает на вход список имен.
 * Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).
 */

 class Exercise1 {
    public static String filteredListNames(List<String> names) {
        return names.stream()
                .filter(name -> (names.indexOf(name)+1) % 2 != 0)
                .map(name -> (names.indexOf(name)+1) + ". " + name)
                .collect(Collectors.joining(", "));
    }
}