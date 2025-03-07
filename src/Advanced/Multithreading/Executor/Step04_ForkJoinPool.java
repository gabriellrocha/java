package Advanced.Multithreading.Executor;

import java.util.concurrent.ForkJoinPool;

public class Step04_ForkJoinPool {

    /*
        Thread Pool especializado p/ tarefas que podem ser divididas em subtarefas menores(fork/join)

        ForkJoinPool funciona quebrando uma tarefa grande em tarefas menores(fork) e depois
        combinando os resultados(join)

        Basicamente cada thread no pool executa suas próprias tarefas, mas se ficar ociosa ela "rouba"
        tarefas inacabadas de outras threads(work-stealing, ou roubo de trabalho)

        No ExecutorService, cada thread executa apenas suas tarefas atribuídas. Quando termina, busca
        novas na fila, mas não "rouba"de outras threads, como no ForkJoinPool.

        É a implementação padrão do paralelismo do Stream API parallelStream()
    * */

    public static void main(String[] args) {

        // Este pool usa um número de threads baseado no número de núcleos da CPU

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        System.out.println(ForkJoinPool.commonPool().getParallelism());


    }
}
