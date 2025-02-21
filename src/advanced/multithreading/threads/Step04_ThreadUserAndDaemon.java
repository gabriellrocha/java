package advanced.multithreading.threads;

import java.util.concurrent.TimeUnit;

public class Step04_ThreadUserAndDaemon {

/* ""Tipos"" de thread em Java:

    User Thread - Mantém a JVM ativa até que todas sejam finalizadas
    Daemon Thread - É finalizada automaticamente quando não há mais User Threads em execução

    - Daemon não é um tipo de thread separada, mas sim uma flag que pode ser definida setDaemon(true)
    - A distinção de threads existe apenas dentro da JVM p/ controle do ciclo de vida da aplicação. No SO
    todas as threads são tratadas da mesma forma, independente de serem daemon ou user

*/

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(getTask());

        thread.setDaemon(true);
        thread.start();

        Thread.sleep(10000); // Mantém a JVM ativa

        System.out.println(Thread.currentThread().getName() + ": program finished");
    }

    private static Runnable getTask() {

        return () -> {

            while (true) {
                System.out.println(Thread.currentThread().getName() + " executing...");
                try {
                    Thread.sleep(3000); // simulating worker
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}
