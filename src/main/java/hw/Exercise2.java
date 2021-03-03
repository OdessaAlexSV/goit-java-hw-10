package main.java.hw;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Метод принимает на вход список из строк (можно список из Задания 1).
 * Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
 */

class Exercise2 {
   public static List<String> modifiedListOfNames(List<String> names) {
        return names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
