package Java8.Streams.Operations.Intermediate;

import java.util.stream.IntStream;

public class Step01_Filter {


    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 100);

        /* Retorna um novo Stream contendo apenas os elementos que atendem
         ao predicato(Predicate) fornecido.
        */

        intStream.filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

}
