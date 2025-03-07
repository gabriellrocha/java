package Advanced.Multithreading.Threads;

public class Step05_ThreadJoin {

/* join(): Faz com que a thread que o chama aguarde até a thread associada termine sua execução

       - Útil quando precisar que a execução de uma Thread dependa da conclusão de outra Thread(s)
*/

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Car in circulation...");

        Thread thread = new Thread(trafficLight());
        thread.start();
        thread.join();      // Thread 'main' aguarda esta thread terminar sua tarefa

        System.out.println("Car is back in circulation... ");
    }


    private static Runnable trafficLight() {

        return () -> {
            System.out.println("Traffic light closed(5 seconds to open)");

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("\nTraffic light open");
        };
    }
}
