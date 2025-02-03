package java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step03_SpecializationsOfStreams {

    public static void main(String[] args) {

        // Streams específicos
        // IntStream -> para int
        // LongStream -> para long
        // DoubleStream -> para double

        // São otimizados para evitar autoboxing e possuem métodos específicos.
        // Para converter um Stream<T> genérico em um desses, use mapToInt(), mapToLong(), mapToDouble()


        double sum = Stream.of(new Product("Notebook", 3999.0), new Product("Smartphone", 1740.0))
                .mapToDouble(Product::price)
                .sum();


        IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

    }
}

record Product(String name, Double price){}
