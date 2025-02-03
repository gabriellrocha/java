package java8.stream;

import java.util.List;

public class Step06_FlatMapExample {

    public static void main(String[] args) {

        // flatMap - transforma e 'achata' os elementos

        /* É usado para desaninhar coleções aninhadas, transformando várias coleções num Stream
            em um Stream único e contínuo */

        List<List<Integer>> numbers = List.of(
                List.of(4, 5, 6),
                List.of(9, 8, 1)
        );

        // aplica uma função de retorna um Stream para CADA ELEMENTO
        // concatena todoos os Stream num único stream contínuo

        List<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .toList();

        result.forEach(System.out::println);


        // Example 2

        List<List<String>> names = List.of(
                List.of("Gabriel", "Maria", "Rebeca"),
                List.of("Joaquim", "Nicolas", "Ana")
        );

        names.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);
    }

}
