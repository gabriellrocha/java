package Java8.Lambdas.apidefault;

import java.util.Random;
import java.util.function.Supplier;

public class Step04_Supplier {

    public static void main(String[] args) {

        // Supplier - Produz um resultado, mas não aceita valores
        // Não tem composição de métodos como em Predicate, Function, etc.

        Supplier<Integer> randomInt = () -> new Random().nextInt();

        System.out.println(randomInt.get());

    }
}
