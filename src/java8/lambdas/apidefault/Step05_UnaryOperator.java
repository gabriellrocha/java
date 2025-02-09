package java8.lambdas.apidefault;

import java.util.function.UnaryOperator;

public class Step05_UnaryOperator {

    public static void main(String[] args) {

        // Representa uma operação em um operando que produz um resultado do MESMO tipo

        UnaryOperator<Double> multiply = number -> number * 2;
        UnaryOperator<Double> addition = number -> number * 2;

        Double result = multiply.andThen(addition).apply(50D);
        System.out.println(result);
    }
}
