package java8.optional;

import java.util.Optional;

public class Step01_OptionalDemo {

    // Classe que encapsula um valor que pode ou não estar presente

    /* Motivação - Evitar o uso de valores nulos, reduzir os riscos de NullPointerException
        e incentivar o tratamento explícito de valores ausentes*/

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("S");

        optional.ifPresent(System.out::println);

        String result = optional.orElse("Default"); // se valor ausente retorna o valor ‘default’

        String result2 = optional.orElseThrow(); // se valor ausente lança NoSuchElementException

        String result3 = optional.orElseThrow(RuntimeException::new); // se valor ausente, lança exception personalizada

        String result4 = optional.get(); // se valor == null lança NoSuchElementException
    }
}
