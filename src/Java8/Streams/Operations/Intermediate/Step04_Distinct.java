package Java8.Streams.Operations.Intermediate;

import java.util.Objects;
import java.util.stream.Stream;

public class Step04_Distinct {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Gabriel", "Maria", "Gabriel", "Maria");

        /* Retorna um novo Stream contendo apenas elementos únicos, removendo duplicatas
           com base no equals(). Mantém a ordem original dos elementos.
        */

        stream.distinct()
                .forEach(System.out::println);

    }
}

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}