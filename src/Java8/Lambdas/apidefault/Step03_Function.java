package Java8.Lambdas.apidefault;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Step03_Function {

    public static void main(String[] args) {

        // Function - Aceita um argumento e produz um resultado

        List<User> list = Arrays.asList(
                new User.UserBuilder().name("Gabriel").age(40).build(),
                new User.UserBuilder().name("Maria").age(50).build(),
                new User.UserBuilder().name("João").age(60).build()
        );

        Function<User, UserDTO> toDto = UserDTO::new;

        list.stream().map(toDto)
                .forEach(System.out::println);

        // Example 2

        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        Function<Integer, Integer> additionByFive = number -> number + 5;

        // Ordem execução andThen: this -> after
        int result1 = multiplyByTwo
                .andThen(additionByFive)
                .apply(5);

        System.out.println(result1);

        // Ordem execução compose: before -> this
        int result2 = additionByFive
                .compose(multiplyByTwo)
                .apply(8);

        System.out.println(result2);
    }
}
