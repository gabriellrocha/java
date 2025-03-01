package java8.streams.operations.terminal.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step05_CollectorsJoining {

    /*
        joining() - Utilizado p/ concatenar os elementos de um Stream em uma única String
        Pode incluir delimitador, prefixo e sufixo, conforme necessário
    */

    public static void main(String[] args) {

        Stream<Person> personStream = Stream.of(
                new Person("Gabriel"),
                new Person("João"),
                new Person("Maria"),
                new Person("Rebeca")
        );

        String result = personStream.map(p -> p.getName())
                .collect(Collectors.joining(" - ", "(", ")"));

        System.out.println(result);
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


