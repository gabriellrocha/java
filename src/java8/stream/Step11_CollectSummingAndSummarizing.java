package java8.stream;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class Step11_CollectSummingAndSummarizing {

    public static void main(String[] args) {

        Stream<Fruit> fruits = Fruit.getFruits();


        // summingInt(), summingDouble(), summingLong()
        // Usados para SOMAR os valores numéricos de um Stream

        Double firstSum = fruits.collect(Collectors.summingDouble(Fruit::price));


        // summarizingInt(), summarizingDouble() e summarizingLong()
        // Fornecem ESTATÍSTICAS (soma, media, min, max, count) sobre elementos numéricos de um Stream

        DoubleSummaryStatistics statistics = fruits.collect(Collectors.summarizingDouble(Fruit::price));
        System.out.println(statistics);


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
