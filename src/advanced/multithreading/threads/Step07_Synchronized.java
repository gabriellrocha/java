package advanced.multithreading.threads;

public class Step07_Synchronized {

/*
    Synchronized - Mecanismo de sincronização que garante que um bloco de código/métoodo seja
    executado por apenas uma thread por vez. É utilizado p/ evitar condições de corrida.

    - É uma forma de controle manual de concorrência

    - Pode ser usado de três formas principais:
      - Dentro de um métoodo (sincroniza um trecho específico de código)
      - Métoodo sincronizado (sincroniza toodo o métoodo)
      - Sincronização em blocos estáticos (sincroniza a classe inteira)
*/

    static private int number;

    public static void main(String[] args) {

        Counter counter = new Counter();

        // Threads sincronizadas

        new Thread(counter::increment).start();
        new Thread(counter::increment).start();
        new Thread(counter::increment).start();
        new Thread(counter::increment).start();

    }

    // sincronização a nível de classe
    public static synchronized void increment() {
        number ++;
        System.out.println(Thread.currentThread().getName() + ": increased the number by 1");
    }
}

class Counter {

    private int value;

    public void increment() {

        // apenas este trecho é sincronizado
        synchronized (this) {
            value++;
            System.out.println(Thread.currentThread().getName() + ": increased the number by 1. Current value " + value);
        }
    }
}
