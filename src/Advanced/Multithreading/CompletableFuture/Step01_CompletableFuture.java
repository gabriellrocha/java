package Advanced.Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Step01_CompletableFuture {

/* Representa uma computação assíncrona com possível resultado futuro.
    - Permite computação assíncrona ao executar tarefas em segundo plano, sem bloquear a thread principal
    - Permite encadear operações síncronas(thenApply) e assíncronas(thenApplyAsync)
    - Lida com exceções
    - Usa ForkJoinPool.commonPool() por padrão, mas permite um Executor personalizado p/ controle de threads

    Para mais, consulte a documentação....

*/

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5 * 5)
                .thenApply(result -> result + 10)
                .thenApply(result -> result + 50)
                .thenApply(result -> {
                    try {
                        Thread.sleep(3000); // simulating worker
                        return result + 100;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });

//      Obtém o resultado final de Completable de forma assíncrona (sem bloquear a thread principal)
      future.thenAccept(result -> System.out.println("Result: " + result));


//      Tanto get() e ()join o obtêm o resultado de forma síncrona (bloqueiam a thread principal) a diferença
//      está no tipo de exceção lançada em caso de erro: get() lança checked e join() unchecked

//        Integer resultWithGet = future.get();
//        Integer resultWithJoin = future.join();
//        System.out.println(resultWithJoin);

    }

    private static String threadName(){
       return Thread.currentThread().getName();
    }
}
