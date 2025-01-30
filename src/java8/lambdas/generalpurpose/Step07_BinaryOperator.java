package java8.lambdas.generalpurpose;

import java.util.function.BinaryOperator;

public class Step07_BinaryOperator {

    public static void main(String[] args) {

        // Representa uma operação sobre dois operando do mesmo tipo, produzindo o resulto do mesmo tipo

        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        average.apply(10.0, 8.11);

    }
}
