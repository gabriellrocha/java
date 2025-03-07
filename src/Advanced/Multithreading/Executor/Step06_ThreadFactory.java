package Advanced.Multithreading.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Step06_ThreadFactory {

    /* ThreadFactory: Permite criar Threads de forma personalizada sendo útil em cenários
        que exige controle sobre como as threads são geradas, como num pool de threads

    * */

    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(4, new CustomThreadFactory());
        service.execute(counter());
        service.execute(counter());
        service.execute(counter());
        service.execute(counter());
        service.shutdown();

    }

    private static Runnable counter() {
        return () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}

// Define uma fábrica personalizada
class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getName() + ": initialized");
        return thread;
    }
}
