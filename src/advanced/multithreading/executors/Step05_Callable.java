package advanced.multithreading.executors;

import java.util.concurrent.*;

public class Step05_Callable {

/*
    Representa uma tarefa que pode ser executada de forma assíncrona e retornar
    um valor ou lançar uma exceção(checked). "Irmão" de Runnable

    - Future: Representa o resultado de uma tarefa assíncrona que pode ser obtido no futuro.
     É bloqueante, pois get() aguarda o resultado da tarefa até que ela seja concluída
*/

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<String> resultFuture = service.submit(new StringRandom());
        Future<String> resultFuture2 = service.submit(new StringRandom());

        String s1 = resultFuture.get();// bloqueia a Thread main
        String s2 = resultFuture2.get(5, TimeUnit.SECONDS);// - lança exception

        System.out.println(s1);
        System.out.println(s2);

        service.shutdown();
    }
}

class StringRandom implements Callable<String> {

    @Override
    public String call() throws Exception {
        return String.valueOf(
                ThreadLocalRandom
                        .current()
                        .nextInt()
        );
    }
}
