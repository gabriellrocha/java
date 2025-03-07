package Advanced.Multithreading.Concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class Step01_ReentrantLock {

    /* Oferece mais flexíbilidade do que synchronized

     - Parâmetro fair = true: Bloqueio justo(Threads são atendidas na ordem que solicitaram o lock - FIFO),
       evitando starvation

     - starvation(Problema de concorrência onde uma thread nunca consegue obter recursos)

    * */

    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock(true);

        new Thread(new Worker("A", reentrantLock)).start();
        new Thread(new Worker("B", reentrantLock)).start();
        new Thread(new Worker("C", reentrantLock)).start();
        new Thread(new Worker("D", reentrantLock)).start();
        new Thread(new Worker("E", reentrantLock)).start();


    }
}

class Worker implements Runnable {

    private final String name;
    private final ReentrantLock reentrantLock;

    public Worker(String name, ReentrantLock reentrantLock) {
        this.name = name;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {

        reentrantLock.lock();
        try {
            System.out.printf("Thread %s entrou na sessão crítica%n", name);
            System.out.printf("%d Threads esperando na fila%n", reentrantLock.getQueueLength());
            System.out.printf("Thread %s vai esperar por 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s vai finalizou%n", name);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            reentrantLock.unlock(); // não pode esquecer
        }
    }
}
