package Java8.Streams.Operations.Terminal;

import java.util.stream.Stream;

public class Step01_ForEachOrdered {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Gabriel", "Joaquim", "José", "Helena", "Maria");

        /* forEach() - Itera sobre todos os elementos do Stream e executa uma
           ação forncecida(Consumer) p/ cada um. Não garante ordem quando o Stream é paralelo.

           forEachOrdered() - Garante a ordem
        */

        names.parallel()
                .forEachOrdered(System.out::println);

    }
}
