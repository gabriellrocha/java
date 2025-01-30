package java8.lambdas.generalpurpose;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Step06_BiFunction {

    public static void main(String[] args) {

        // Representa uma função que recebe dois argumentos e produz um resultado

        BiFunction<Double, Double, Double> average = (n1, n2) -> (n1 + n2) / 2;

        Double grade = average.apply(9.0, 7.8); // = 8.4


        // Example 2

        Function<Double, Double> bonus = nota -> nota + nota * 0.05;

        Double gradeFinal = average.andThen(bonus).apply(9.3, 8.1);
        System.out.println(gradeFinal);

    }
}
