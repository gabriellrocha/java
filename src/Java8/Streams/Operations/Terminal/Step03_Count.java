package Java8.Streams.Operations.Terminal;

import java.util.stream.Stream;

public class Step03_Count {

    public static void main(String[] args) {

        Stream<String> letters = Stream.of("A", "D", "Z", "Y", "Q");

        /*
            Retorna o número de elementos presente
        */

        long count = letters.count();
        System.out.println(count);
    }
}
