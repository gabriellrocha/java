package java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step10_Collect {

    public static void main(String[] args) {

        /* collect - Usado para coletar os elementos do Stream numa estrutura de dados
         ou realizar operações de redução*/

        // Collectors classe utilitária que fornece implementações pronta de uma interface Collector

        // Alguns exemplos....

        Set<String> set = getStrings().collect(Collectors.toSet());
        Set<String> setUnmodifiable = getStrings().collect(Collectors.toUnmodifiableSet());
        String singleString = getStrings().collect(Collectors.joining(", "));
        Map<Character, List<String>> map = getStrings().collect(Collectors.groupingBy(s -> s.charAt(0)));


    }

    private static Stream<String> getStrings() {

        return Stream.of("Joca", "João", "Maria", "Mariana", "Gustavo");

    }
}
