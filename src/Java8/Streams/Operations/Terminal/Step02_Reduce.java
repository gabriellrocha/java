package Java8.Streams.Operations.Terminal;

import java.util.stream.Stream;

public class Step02_Reduce {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        /* Reduz os elementos do Stream a um único valor, aplicando uma
        função de combinação. Recebe dois parâmetros: um valor inicial(opcional)
        e uma função binária(BiFunction) que define como combinar os elementos
        */

        Integer result = numbers.reduce(0, (n1, n2) -> n1 + n2);

        // resultado encapsulado em um Optional
        numbers.reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);


        /* Versão usada em Streams Paralelos. Permite combinar os resultados parciais
         de diferentes threads usando o combiner
        */

        Integer resultParallel = numbers.parallel()
                .reduce(0,
                        (a1, a2) -> a1 + a2,  // accumulator - BiFunction
                        (c1, c2) -> c1 + c2); // combiner - BinaryOperator

        System.out.println(resultParallel);
    }
}
