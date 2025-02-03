package java8.stream;

import java.util.List;

public class Step05_Lazy {

    public static void main(String[] args) {

        // Operações Intermediárias

        // São Lazy, ou seja, são apenas definidas e não executadas imediatamente
        // Criam um pipeline de transformação que só será realmente executado quando uma operação terminal for chamada


        // Operações intermediárias podem ser combinadas em um único ciclo de iteração para reduzir a quantidade de trabalho

        // Example

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .forEach(System.out::println);

        /* Ao invés de filtrar os números e depois aplicar o map() em todos os elementos filtrados, o stream
           pode fazer isso de forma combinada numa única passagem:

           - filtra um número
           - SE for par, aplica a transformação map()

        */
    }
}
