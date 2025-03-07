package Java8.Streams.Operations.Terminal.Collect;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step01_Collect {

    /* collect() é uma operação terminal muito poderosa e flexível.
       Transforma um Stream em uma coleção ou outro tipo de resultado, como
       uma lista, conjunto ou mapa

       Recebe um Collector, implementação do padrão Strategy e define como os
       elementos devem ser coletados

       Agrupa, acumula ou transforma os elementos de acordo com a lógica
       do Collector
    */

    public static void main(String[] args) {

        Stream<String> streamNames = Stream.of("Joca", "João", "Maria", "Mariana", "Gustavo");

        List<String> list = streamNames.collect(Collectors.toList());
        List<String> unmodifiableList = streamNames.collect(Collectors.toUnmodifiableList());


        Set<String> set = streamNames.collect(Collectors.toSet());
        Set<String> unmodifiableSet = streamNames.collect(Collectors.toUnmodifiableSet());
    }
}
