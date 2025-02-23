package advanced.multithreading.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Step02_ReentrantReadWriteLock {

    /* Lock que separar leitura/escrita para melhorar a concorrência

       - Permite múltiplas leituras simultâneas, mas exclusividade na escrita
       - Warning: escrita pode sofrer 'starvation' se houver muitas leituras

     */

    public static void main(String[] args) throws InterruptedException {


        ListReadWrite listReadWrite = new ListReadWrite(new ReentrantReadWriteLock());

        Thread threadReader = new Thread(listReadWrite::readList, "ThreadReader");
        Thread threadWriter = new Thread(listReadWrite::add, "ThreadWriter");


        threadWriter.start();
        threadReader.start();

    }
}

class ListReadWrite {

    private final List<String> list = new ArrayList<>();
    private final ReentrantReadWriteLock reentrantReadWriteLock;

    public ListReadWrite(ReentrantReadWriteLock reentrantReadWriteLock) {
        this.reentrantReadWriteLock = reentrantReadWriteLock;
    }

    public void add() {

        reentrantReadWriteLock.writeLock().lock(); // (nenhuma outra Thread escrita/leitura pode acessar)
        try {
            System.out.println(Thread.currentThread().getName() + ": Obteve o lock de escrita");
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.print("Adding " + i + ".... ");
                    list.add(String.valueOf(i));
                    Thread.sleep(1200); // simulating work
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        } finally {
            reentrantReadWriteLock.writeLock().unlock();
            System.out.println(Thread.currentThread().getName() + ": Liberou o lock de escrita");
        }
    }

    public void readList() {

        if (reentrantReadWriteLock.isWriteLocked()) {
            System.out.println(Thread.currentThread().getName() + ": O Writer lock já foi obtido. Aguardando...");
        }

        reentrantReadWriteLock.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName() + ": Obteve o lock de leitura");
            System.out.println(list);

        } finally {
            reentrantReadWriteLock.readLock().unlock();
            System.out.println(Thread.currentThread().getName() + " Liberou o lock de leitura");
        }
    }
}
