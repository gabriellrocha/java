package advanced.multithreading.threads;

public class Step09_RaceCondition {

    private static int count;       // warning: race condition

    public static void main(String[] args) throws InterruptedException {

        // Problema de concorrência:
            // Race condition:
                // duas ou+ threads acessam um recurso compartilhado ao mesmo tempo, causando resultados inesperados

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        };

        new Thread(task).start();
        new Thread(task).start();

        Thread.sleep(5000); // aguardando as threads fazerem o incremento
        System.out.println(count); // resultado imprevisível
    }
}
