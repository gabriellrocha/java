package advanced.multithreading.threads;

public class Step03_ThreadStates {

    // States - Diferentes estágios do ciclo de vida

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("Executing..."));  // NEW (start() ainda não foi chamado)

        thread.start();   // RUNNABLE (Pronta para executar, aguardando tempo de CPU)
                          // BLOCKED (Aguardando acesso a um recurso bloqueado)
                          // WAITING (Pausada indefinidamente até ser notificada)
                          // TIMED_WAITING(Pausada por um tempo específico (sleep(), wait(time))
                          // TERMINATED (Após concluir a execução do run() ou há uma exceção não tratada)


        // As principais Transição de estado:

//         NEW -> RUNNABLE (start())
//         RUNNABLE -> RUNNING (Quando recebe tempo de CPU)
//         RUNNING -> BLOCKED (Tentativa de acesso a recurso bloqueado)
//         RUNNING -> WAITING/TIMED_WAITING (wait(), sleep(), join(time))
//         WAITING/TIMED_WAITING -> RUNNABLE (notify(), tempo expirado)
//         BLOCKED -> RUNNABLE (Quando o recurso é liberado)
//         RUNNING → TERMINATED (quando run() termina ou há uma exceção não tratada)

//        RUNNING - não é um estado oficial da thread(é apenas pra específicar que thread recebeu tempo de CPU)
    }
}
