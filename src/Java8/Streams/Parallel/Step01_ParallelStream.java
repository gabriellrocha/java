package Java8.Streams.Parallel;

import java.util.stream.LongStream;

public class Step01_ParallelStream {

    public static void main(String[] args) {

        // Processamento paralelo desconsiderando o UnBoxing
        withParallelProcessing();

        // Sem processamento paralelo
        withoutParallelProcessing();

    }

    private static void withParallelProcessing() {

        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1, 1_000_000_000).parallel().sum();

        System.out.printf("Result with parallel processing: Value %d | Time %d ms%n", result, System.currentTimeMillis() - init);
    }

    private static void withoutParallelProcessing() {

        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1, 1_000_000_000).sum();

        System.out.printf("Result without parallel processing: Value %d | Time %d ms%n", result, System.currentTimeMillis() - init);
    }

}
