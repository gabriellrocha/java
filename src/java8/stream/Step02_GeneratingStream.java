package java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Step02_GeneratingStream {
    public static void main(String[] args) {

        // Stream de diferentes fontes

        // métoodo estático
        Stream<String> languages = Stream.of("Java", "Python", "C", "C++", "C#");


        // de um array
        String[] arrayFromLanguages = {"Java", "JavaScript", "Lua", "Go"};
        Stream<String> languages2 = Arrays.stream(arrayFromLanguages);

        // de um Sub array
        Integer[] numbers = {5, 6, 0, 1, 2, 0, 4, 2, 4};
        Arrays.stream(numbers, 0, 5) // Obtém Stream tipado: IntStream
                .forEach(System.out::println);             // 5, 6, 0, 1, 2


        // de uma Collection
        List<String> fruits = List.of("Banana", "Abacaxi", "Melancia", "Uva", "Morango");

        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        // de um arquivo

        try(Stream<String> lines = Files.lines(Paths.get("src/java8/streams/file.txt"))) {

            lines.filter( l -> l.contains("Java"))
                    .forEach(System.out::println);


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}


