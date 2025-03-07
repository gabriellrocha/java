package Java8.Streams.Operations.Terminal.Collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step02_CollectorsGroupingBy {

    /* Agrupa os elementos de um Stream em um Map, baseado numa chave forncecida por
     uma 'função classificadora'

    */

    public static void main(String[] args) {

        Stream<String> words = Stream.of("a", "bb", "aa", "ccc", "ddab", "a", "wer");

        Map<Integer, List<String>> groupedByLength = words.collect(
                        Collectors.groupingBy(String::length));  // method reference que gera a chave

        System.out.println(groupedByLength);


        List<Integer> numbers = List.of(1, 3, 5, 6, 7, 8, 97, 345, 6, 543, 122, 3, 9, 0);

        Map<String, List<Integer>> groupedByParity = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "ODD" : "EVEN")); // lambda que gera a chave

        System.out.println(groupedByParity);
    }
}
