package Advanced.Multithreading.Threads;

public class Step02_ThreadIntroPart2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(getTask());
        Thread thread2 = new Thread(getTask());
        Thread thread3 = new Thread(getTask());

        // run() executa a lógica da Thread
            // Se chamado diretamente será executado na mesma Thread que fez a chamada

        // Não há paralelismo - São executadas sequencialmente pela Thread main
        thread1.run();
        thread2.run();
        thread3.run();
    }

    private static Runnable getTask() {

        return () -> System.out.println(Thread.currentThread().getName() + ": executed");

    }
}
