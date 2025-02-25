package advanced.multithreading.executors;

import java.util.concurrent.*;

public class Step02_ExecutorService {

    /* ExecutorService - Estende Executor, oferecendo mais controle sobre a execução
       de tarefas assíncronas. Permite:

       - Submeter tarefas (submit, invokeAll, invokeAny)
       - Controlar o ciclo de vida (shutdown, awaitTermination)
       - Trabalhar com Future (obter resultados assíncronos)

       future.get() ideal p/ obter o resultado de uma tarefa de forma síncrona(bloqueante)
    */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // newFixedThreadPool() - Threads ociosas permanecem ativas
        // se o n° de tarefas enviadas for maior que o n° de threads disponíveis, elas serão colocadas em fila
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(taskWithoutReturn());
        executorService.shutdown(); // (inicia o encerramento - permite que as tasks já enviadas sejam concluídas)


        // newCachedThreadPool() - Pool com n° de threads arbitrário - ociosas são removidas
        // o pool de threads em cache pode crescer sem limites p/ acomodar qualquer número de tarefas
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        Future<Integer> future = executorService1.submit(taskWithReturn());
        System.out.println(future.get()); // É bloqueante
        executorService1.shutdown();

    }

    private static Runnable taskWithoutReturn() {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " executed task...");
        };
    }

    private static Callable<Integer> taskWithReturn() {

        return () ->
                ThreadLocalRandom.current().nextInt(10);
    }
}
