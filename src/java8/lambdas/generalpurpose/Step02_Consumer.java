package java8.lambdas.generalpurpose;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Step02_Consumer {

    public static void main(String[] args) {

        // Consumer - Aceita um valor de entrada e não retorna nenhum resultado

        // andThen combina vários Consumer

        Consumer<String> firstConsumer = message -> System.out.println(message + "...");
        Consumer<String> secondConsumer = message -> System.out.println(message + "...");

        Consumer<String> combined = firstConsumer.andThen(secondConsumer);
        combined.accept("Gabriel");


        // Example 2

        List<User> list = Arrays.asList(
                new User.UserBuilder().name("Gabriel").age(40).build(),
                new User.UserBuilder().name("Maria").age(50).build(),
                new User.UserBuilder().name("João").age(60).build()
        );

        Consumer<User> printAge = user -> System.out.println(user.getAge());

        list.forEach(printAge);


    }
}
