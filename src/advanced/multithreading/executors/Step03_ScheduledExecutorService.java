package advanced.multithreading.executors;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Step03_ScheduledExecutorService {

    /* ScheduledExecutorService - Interface que estende ExecutorService e permite agendar
       tarefas p/ execução futura ou repetitiva

       ScheduledThreadPoolExecutor - Implementação
    */

    public static void main(String[] args) throws InterruptedException {

        System.out.println(LocalTime.now());

        ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(1);

        // executa uma única vez com atraso
        scheduledService.schedule(new Clock(), 5, TimeUnit.SECONDS);
        scheduledService.shutdown();

//      executa periodicamente, com intervalo fixo entre inícios
//      scheduledService.scheduleAtFixedRate(new Clock(), 1, 5, TimeUnit.SECONDS);

//      executa periodicamente, o atraso começa a contar após a tarefa terminar
//      scheduledService.scheduleWithFixedDelay(new Clock(), 1, 3, TimeUnit.SECONDS);

    }
}

class Clock implements Runnable {

    @Override
    public void run() {
        System.out.println(LocalTime.now() + " Beep");
    }
}
