package java8.streams.operations.intermediate;

import java.util.stream.Stream;

public class Step07_Limit_Skip {

    public static void main(String[] args) {

        // Limit - Retorna um novo Stream contendo apenas os primeiros N elementos do Stream original

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).limit(4)
                .forEach(System.out::println);


        // Skip - Retorna um novo Stream ignorando os primeiros N elementos do Stream original

        Stream.of(7, 2, 8, 9, 0, 1, 2).skip(3)
                .forEach(System.out::println);
    }
}
