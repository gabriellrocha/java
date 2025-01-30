package advanced.interfaces.ordination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparable {

    public static void main(String[] args) {

        // Define um critério de comparação entre objetos

        // Comparable - Define a ORDEM NATURAL dentro da própria classe

        List<User> users = new ArrayList<>(List.of(
                new User("Zé"),
                new User("Gabriel"),
                new User("Maria")
        ));

        Collections.sort(users);
        users.forEach(System.out::println);

    }
}

record User(String name) implements Comparable<User> {

    @Override
    public int compareTo(User other) {
        return this.name.compareTo(other.name());
    }
}
