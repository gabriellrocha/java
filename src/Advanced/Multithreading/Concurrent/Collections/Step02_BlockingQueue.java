package Advanced.Multithreading.Concurrent.Collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Step02_BlockingQueue {

    /*  Fila Thread-Safe

        - Operações de inserção(put) e remoção(tack) bloqueiam quando a fila está cheia/vazia, respectivamente

    */

    public static void main(String[] args) throws InterruptedException {

//      Implementações...

        BlockingQueue<String> arrayQueue = new ArrayBlockingQueue<>(1); // capacidade fixa
//      BlockingQueue<String> linkedQueue = new LinkedBlockingQueue<>(); opcionalmente ilimitada
//      BlockingQueue<String> priorityQueue = new PriorityBlockingQueue<>(); // remoção com base na ordem de prioridade


        arrayQueue.put("Gabriel");

        // peek - recupera o elemento do início sem removê-lo
        System.out.printf("%s: added to value %s%n", getNameThread(), arrayQueue.peek());

        System.out.printf("%s: trying to add another value...%n", getNameThread());
        Thread.sleep(4000); // simulating worker

        new Thread(remove(arrayQueue)).start();
        arrayQueue.put("Rocha");
        System.out.printf("%s: added to value %s", getNameThread(), arrayQueue.peek());
    }

    private static Runnable remove(BlockingQueue<String> queue) {

        return () -> {
            try {
                String value = queue.take();
                System.out.printf("%s: removed to value %s%n", getNameThread(), value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static String getNameThread() {
        return Thread.currentThread().getName();
    }

}
