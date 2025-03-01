package java8.streams.operations.intermediate;

import java.util.stream.Stream;

public class Step02_Map {

    public static void main(String[] args) {

        Stream<String> fruits = Stream.of("banana", "apple", "orange", "watermelon");

        /* Retorna um novo Stream com os elementos transformados de acordo
         com a função(Function) forncecida
        */

        fruits.map(f -> f.toUpperCase())
                .forEach(System.out::println);
    }
}
