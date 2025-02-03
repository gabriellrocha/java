package java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Step04_ShortCircuit {

    public static void main(String[] args) {

        // Operações Short-circuit - Para a execução do Stream assim que o resultado for determinado
        // match = corresponder

        List<Double> notas = List.of(7.5, 8.3, 8.1, 9.0, 6.8, 9.8, 7.4, 5.6);

        Predicate<Double> aprovado = n -> n >= 7.5;


        boolean resultAnyMatch = notas.stream()
                .anyMatch(aprovado);            // true se QUALQUER elemento satisfazer a execução

        boolean resultAllMatch = notas.stream()
                .allMatch(aprovado);            // true se TODOS os elementos satisfazerem a condição

        boolean resultNone = notas.stream()
                .noneMatch(aprovado);           // true se NENHUM elemento satisfazer a condição

        Optional<Double> first = notas.stream()
                .filter(aprovado)
                .findFirst();                   // primeiro elemento que corresponde à condição


        Optional<Double> any = notas.stream()  // retornar qualquer um que corresponde à condição
                .filter(aprovado)              // com stream() sem vantagem sobre findFirst()
                .findAny();


        Optional<Double> Parallel = notas.parallelStream() // com parallelStream(), pode ser mais rápido
                .filter(aprovado)                           // pega o primeiro sem seguir ordem
                .findAny();

    }
}


