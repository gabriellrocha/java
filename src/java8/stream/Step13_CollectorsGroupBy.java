package java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Step13_CollectorsGroupBy {

    public static void main(String[] args) {

        // groupingBy - Agrupa elementos de um Stream em um Map, baseado numa chave
        // fornecida por uma 'função classificadora'


        Map<Movie.Category, List<Movie>> result = getMovies()
                .stream()
                .collect(Collectors.groupingBy(Movie::category));  // métoodo que gera a chave

        System.out.println(result);


        // Example 2

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<String, List<Integer>> oddOrEven = numbers.stream()
                .collect(Collectors.groupingBy(
                n -> n % 2 == 0 ? "ODD" : "EVEN")       // lógica que gera a chave
        );

        System.out.println(oddOrEven);
    }


    private static List<Movie> getMovies() {

        return List.of(
                new Movie("Superbad", Movie.Category.COMEDY),
                new Movie("The Hangover", Movie.Category.COMEDY),
                new Movie("John Wick", Movie.Category.ACTION),
                new Movie("Blade Runner 2049", Movie.Category.SCIENCE_FICTION),
                new Movie("Die Hard", Movie.Category.ACTION),
                new Movie("The Matrix", Movie.Category.SCIENCE_FICTION),
                new Movie("Mad Max", Movie.Category.ACTION),
                new Movie("Interstellar", Movie.Category.SCIENCE_FICTION)
        );
    }
}

record Movie(String name, Category category){

     enum Category {

        ACTION,
        SCIENCE_FICTION,
        COMEDY
    }
}
