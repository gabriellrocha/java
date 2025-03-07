package Java8.Streams.Operations.Terminal.Collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step03_CollectorsSumming {

    /*  summing() - Utilizado para calcular a soma dos valores numéricos no Stream

       summingDouble(), summingInt(), summingLong()
    */

    public static void main(String[] args) {

        Stream<Fruit> fruits = Fruit.getFruits();

        Double priceTotal = fruits.collect(Collectors.summingDouble(Fruit::price));
    }
}

record Fruit(String name, Double price){

    public static Stream<Fruit> getFruits(){

        return Stream.of(
                new Fruit("Banana", 1.99),
                new Fruit("Apple", 3.99),
                new Fruit("Peach", 5.99),
                new Fruit("Orange", 2.99)
        );
    }
}
