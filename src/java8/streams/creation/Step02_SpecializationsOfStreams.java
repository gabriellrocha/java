package java8.streams.creation;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step02_SpecializationsOfStreams {

    /* Streams otimizados p/ tipos primitivos específicos, como IntStream, LongStream e
    DoubleStream, que evitam autoboxing e oferecem métodos eficientes p/ operações numéricas
    */

    public static void main(String[] args) {

        // Para converter um Stream<T> genérico em um desses, use mapToInt(), mapToLong(), mapToDouble()

        double sum = Stream.of(
                        new Product("Notebook", 3999.0),
                        new Product("Smartphone", 1740.0))
                .mapToDouble(Product::price)
                .sum();


        IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

    }
}

record Product(String name, Double price) {
}
