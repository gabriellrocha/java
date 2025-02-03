package java8.stream;

import java.util.stream.Stream;

public class Step09_Peek {

    public static void main(String[] args){

        // peek - usado para inspecionar os elementos sem alterar seu conteúdo

        Stream.of("Gabriel", "Maria", "João", "Rebeca")
                .peek(System.out::println)      // executa uma ação sem alterar os elementos
                .map(String::toUpperCase)
                .toList().forEach(System.out::println);

    }
}
