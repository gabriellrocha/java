package java8.streams.operations.intermediate;

import java.util.List;

public class Step05_Sorted {

    public static void main(String[] args) {

        List<String> letters = List.of(
                "J", "M", "A", "X", "E", "L", "G", "O", "B", "Y",
                "W", "N", "D", "T", "U", "V", "H", "Q", "Z", "F",
                "C", "K", "R", "P", "I", "S"
        );

        /* Retorna um novo Stream com os elementos ordenados.
           Sem argumento - Usa a ordem natural (Comparable)
           Comparator - Usa a ordem definida pelo comparator fornecido
        */

        // Comparable
        letters.stream().sorted()
                .forEach(System.out::println);

        // Comparator
        letters.stream().sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}


