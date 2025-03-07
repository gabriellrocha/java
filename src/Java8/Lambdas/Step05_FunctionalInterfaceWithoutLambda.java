package Java8.Lambdas;

import java.util.function.Predicate;

public class Step05_FunctionalInterfaceWithoutLambda {

    public static void main(String[] args) {

        // Exemplos antes do Java 8

        // Métoodo 1
        // Esta sintaxe cria uma classe anônima que implementa Predicate<Integer>

        Predicate<Integer> isEven = new Predicate<Integer>() {

            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };


        System.out.println("Object: " + isEven);
        System.out.println("Anonymous class: " + isEven.getClass());


        // Métoodo 2
        // Utilizando uma classe separada

        Predicate<Integer> idEven = new PredicateTest();


        // Métoodo 3 com Lambda

        Predicate<Integer> isEvenn = n1 -> n1 % 2 == 0;
        isEvenn.test(14);
    }
}

class PredicateTest implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer %2 == 0;
    }
}
