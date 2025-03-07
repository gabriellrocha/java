package Advanced.Multithreading.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

    // Para outros tipo use AtomicXXX
    private final AtomicInteger atomicInteger = new AtomicInteger();

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class Step01_AtomicClass {

    public static void main(String[] args) throws InterruptedException {

        // concurrent.atomic -> conjunto de classes util para manipular um único valor compartilhado
        // de forma thread-safe e sem bloqueios. (Usando instruções atômicas da CPU. Como CAS - Compare-And-Swap)

        Counter counter = new Counter();

        Runnable runnable = () -> {
            for (int i=1; i<=10000; i++) {
                // Operação atômica: lê, incrementa e escreve sem interrupção
                counter.getAtomicInteger().incrementAndGet();
            }
        };

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();

        System.out.println(counter.getAtomicInteger());
    }
}
