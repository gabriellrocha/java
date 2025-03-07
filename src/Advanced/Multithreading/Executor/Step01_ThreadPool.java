package Advanced.Multithreading.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Step01_ThreadPool {

    /* O padrão Thread Pool gerencia a execução de múltiplas threads de forma eficiente,
    permitindo que um número fixo de threads seja reutilizado p/ executar várias tarefas.

     Ou seja, enviamos as tarefas p/ o Executor e ele encarrega de executar usando as threads do pool

     A classe Executors contém métodos p/ a criação de instâncias de pool de thread pré-configuradas
    */

    public static void main(String[] args) {

        // Com Executor, desacoplamos o envio de tarefas da execução real delas.

        Executor executor = Executors.newSingleThreadExecutor(); // Thread Pool com uma Thread
        executor.execute(() -> System.out.println("Hello World!"));

    }
}
