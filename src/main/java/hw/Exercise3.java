package main.java.hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан массив: ["1, 2, 0", "4, 5"]
 * Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
 * "0, 1, 2, 4, 5"
 */

class Exercise3 {

    public static String sortedAllNumbersList(List<String> num) {
        String result = num.stream()
                .map(array -> array.split(", "))
                .flatMap(Arrays::stream)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));
        return (result);
    }
}

