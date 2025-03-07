package Java8.Optional;

import java.util.Optional;

public class Step01_Optional {

    // Optional é um container que pode ou não conter um valor
    // Evita o uso de valores nulos
    // Incentiva o tratamento explícito de valores ausente


    public static void main(String[] args) {

        Optional<String> optional = Optional.of("S");

        optional.ifPresent(System.out::println);

        String result = optional.orElse("Default"); // se valor ausente retorna o valor ‘default’

        String result2 = optional.orElseThrow(); // se valor ausente lança NoSuchElementException

        String result3 = optional.orElseThrow(RuntimeException::new); // se valor ausente, lança exception personalizada

        String result4 = optional.get(); // se valor == null lança NoSuchElementException
    }
}
