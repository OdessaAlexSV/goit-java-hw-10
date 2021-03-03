package main.java.hw;

import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 * который "перемешивает" элементы из стримов first и second, останавливается тогда,
 * когда у одного из стримов закончатся элементы.
 */

public class Exercise5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (i1.hasNext() & i2.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(i1.next(), i2.next()));
        }
        return resultStream.collect(Collectors.collectingAndThen(
                toList(),
                list -> {
                    Collections.shuffle(list);
                    return list.stream();
                }));
    }
}

