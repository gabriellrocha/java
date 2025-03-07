package Java8.Streams.Operations.Intermediate;

import java.util.List;
import java.util.stream.Stream;

public class Step03_FlatMap {

    public static void main(String[] args) {

        Stream<List<Integer>> listStream = Stream.of(
                List.of(4, 6, 9),
                List.of(9, 1, 4, 2, 7)
        );

        /* Transforma cada elemento em um novo Stream e depois concatena todos esses Streams
         em um único Stream final. "Achatando" a estrutura
        */

        // Útil p/ desaninhar coleções
        Stream<Integer> integerStream = listStream.flatMap(List::stream);

    }
}
