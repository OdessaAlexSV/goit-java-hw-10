package main.java.hw;

import java.util.Arrays;
import java.util.List;

/**
 * Дан массив: ["1, 2, 0", "4, 5"]
 * Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
 * "0, 1, 2, 4, 5"
 */

class Exercise3 {

    public static String sortedAllNumbersList(List<String> num) {
        int[] sortedAllNumbers = num.stream()
                .map(array -> array.split(", "))
                .flatMap(Arrays::stream)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        return (Arrays.toString(sortedAllNumbers));
    }
}

