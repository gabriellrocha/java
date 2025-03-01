package java8.streams.operations.terminal;

import java.util.stream.Stream;

public class Step04_Min_Max {

    public static void main(String[] args) {

        /* min e max retornam respectivamente, o menor e maior elemento
           com base no Comparator forncecido

           Ambas encapsulam o retonra em um Optional, pois o Stream pode estar vazio
        */

        Stream.of(5, 8, 1, 2, 9, -4)
                .min(Integer::compareTo)
                .ifPresent(System.out::println);


        Stream.of(5, 8, 1, 2, 9, -4)
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
