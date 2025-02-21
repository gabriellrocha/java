package advanced.multithreading.threads;

public class Step01_ThreadIntroPart1 {

    /* Thread: Menor unidade de execução dentro de um processo(tarefas) - Subprocesso leve.
       Processo: Programa em execução(código, dados, recursos)

         - Threads criadas em Java são mapeadas p/ threads do sistema operacional. Isso significa
         que o gerenciamento, agendamento e execução real das threads é feito pelo kernel do SO.

         - As tarefas p/ uma thread executar são definidas implementando Runnable (ou Callable, se
         precisar de retorno)

      Multithreading: Capacidade de um programa executar múltiplas threads em paralelo dentro de um mesmo processo

     */

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Task());
        Thread thread1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + ": executed"));

        thread.start();
        thread1.start();

        Thread.sleep(2000); // Thread atual pausa a execução por tempo determinado
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": executed");
    }
}