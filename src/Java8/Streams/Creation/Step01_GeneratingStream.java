package Java8.Streams.Creation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step01_GeneratingStream {
    public static void main(String[] args) {

        // Streams obtidos de diferentes fontes


        // Métoodos de fábrica
        Stream.of("Java", "Python", "C", "C++", "C#");
        IntStream.rangeClosed(1, 100);


        // Arrays
        String[] arrayFromLanguages = {"Java", "JavaScript", "Lua", "Go"};
        Stream<String> streamOfLanguages = Arrays.stream(arrayFromLanguages);

        // Sub array
        Integer[] numbers = {5, 6, 0, 1, 2, 0, 4, 2, 4};
        Stream<Integer> streamFromSubArray = Arrays.stream(numbers, 0, 5);


        // Collection
        List<String> fruits = List.of("Banana", "Abacaxi", "Melancia", "Uva", "Morango");
        Stream<String> streamOfString = fruits.stream();


        // Arquivo
        try(Stream<String> lines = Files.lines(Paths.get("src/java8/streams/file.txt"))) {

            lines.filter( line -> line.contains("Java"))
                    .forEach(System.out::println);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // Função geradora - Stream infinito(função que é chamada repetidamente) use limit()
        Stream<Integer> streamGenerate = Stream.generate(() -> new Random().nextInt(100));
    }
}


