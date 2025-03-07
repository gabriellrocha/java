package Java8.Streams.Operations.Intermediate;

import java.util.stream.Stream;

public class Step06_Peek {

    public static void main(String[] args) {

        Stream<String> letters = Stream.of("A", "B", "C", "D", "E", "F", "G");

        /* Permite inspecionar os elementos à medida que passam pelo Stream, sem modificá-los
           Não altera o Stream original
        */

        letters.peek(System.out::println)  // Inspeciona os elementos
                .map(l -> l.toLowerCase())
                .forEach(System.out::println);
    }
}
