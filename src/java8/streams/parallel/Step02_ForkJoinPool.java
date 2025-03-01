package java8.streams.parallel;

import java.util.List;

public class Step02_ForkJoinPool {

    public static void main(String[] args) {

//   ForkJoinPool - Usa uma técnica chamada divisão recursiva

//   (Fork) A tarefa é dividida até que o trabalho seja suficientemente pequeno p/ ser executado em paralelo
//   As tarefas são distribuídas entre os threads no pool
//   (Join) O trabalho (resultado) é combinado de volta


        java.util.concurrent.ForkJoinPool customThreadPool = new java.util.concurrent.ForkJoinPool(4); // limit 6 threads


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int result = customThreadPool.submit(() ->

                list.parallelStream()
                        .peek(n -> System.out.println(Thread.currentThread() + " processing " + n))
                        .mapToInt(Integer::intValue)
                        .sum()
        ).join();// aguarda a finalização de todas as threads

        System.out.println(result);

        customThreadPool.shutdown();
    }
}
