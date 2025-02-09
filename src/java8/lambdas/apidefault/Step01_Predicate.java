package java8.lambdas.apidefault;

import java.util.function.Predicate;

public class Step01_Predicate {

    public static void main(String[] args) {

        // Predicate - Avalia uma expressão e retorna um boolean


        Predicate<Integer> isOdd = number -> number %2 == 1;
        Predicate<Integer> isBig = number -> number >= 1000; // Big - number => 1000

        isOdd.test(10);
        isOdd.test(17);

        boolean result = isOdd.and(isOdd)
                .and(isBig)
                .test(1733);

        System.out.println(result);

    }
}
