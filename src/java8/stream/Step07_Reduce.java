package java8.stream;

import java.util.List;
import java.util.Optional;

public class Step07_Reduce {

    public static void main(String[] args) {


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> reduce = integers.stream() // não tem garantia de retorno
                .reduce(Integer::sum);


        Integer reduce1 = integers.stream()
                .reduce(0, Integer::sum);




        // Cenário de paralelismo
        // Em streams paralelos, o combiner é necessário para combinar os resultados parciais em múltiplas threads


        Integer reduce2 = integers.parallelStream()
                .reduce(
                        0,
                        Integer::sum,   // accumulator
                        Integer::sum);  // combiner

        System.out.println(reduce2);
    }
}
