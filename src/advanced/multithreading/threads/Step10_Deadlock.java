package advanced.multithreading.threads;

public class Step10_Deadlock {

/* DeadLock - Ocorre quando há uma dependência cíclica entre threads.

    Exemplo:
        - Thread A segura o recurso 1 e espera o recurso 2
        - Thread B segura o recurso 2 e espera o recurso 1

    Ambas ficam bloqueadas indefinidamente
*/

    public static void main(String[] args) {

        Object recurs1 = new Object();
        Object recurs2 = new Object();

        // simulating deadlock

        new Thread(blocked1(recurs1, recurs2), "A").start();
        new Thread(blocked2(recurs2, recurs1), "B").start();


    }


    private static Runnable blocked1(Object recurs2, Object recurs1) {

        return  () -> {

            synchronized (recurs1) {
                System.out.println(Thread.currentThread().getName() + ": blocked resource 1");

                try {
                    Thread.sleep(2000);     // dar tempo a outra thread p/ bloquear o outro recurso
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (recurs2) { // nunca vai acontecer
                    System.out.println(Thread.currentThread().getName() + ": blocked resource 2");
                }
            }
        };
    }

    private static Runnable blocked2(Object recurs1, Object recurs2) {

        return () -> {

            synchronized (recurs2) {
                System.out.println(Thread.currentThread().getName() + ": blocked resource 2");

                try {
                    Thread.sleep(1000);     // dar tempo a outra thread p/ bloquear o outro recurso
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (recurs1) { // nunca vai acontecer
                    System.out.println(Thread.currentThread().getName() + ": blocked resource 1");
                }
            }
        };
    }
}
