package advanced.interfaces.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IComparable {

    /* Interface Comparable:

        - Defini a ordem natural dos objetos
        - Usada para sorting (classificação) dos objetos numa coleção
        - Implementada diretamente pela classe cujos objetos devem ser comparados
    */


    public static void main(String[] args) {

        List<User> users = new ArrayList<>(List.of(
                new User("Zé"),
                new User("Gabriel"),
                new User("Maria")
        ));

        Collections.sort(users);
        users.forEach(System.out::println);

    }
}

record User(String name) implements Comparable<User>{
    @Override
    public int compareTo(User other) {
        return this.name.compareTo(other.name);
    }
}

