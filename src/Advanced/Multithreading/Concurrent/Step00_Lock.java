package Advanced.Multithreading.Concurrent;

public class Step00_Lock {

    public static void main(String[] args) {

        /* Lock - Mecanismo usado p/ garantir que apenas um Thread tenha acesso a um recurso
        compartilhado num dado momento. Ele bloqueia o acesso ao recurso p/ outras threads enquanto
        uma thread o está utilizando, impedindo condições de corrida
        */

        /*
           ReentrantLock - Permite que a mesma thread adquira o lock várias vezes sem bloquear
           a si mesma (reentrante)

          ReadWriteLock - Várias threads podem adquirir o lock de leitura ao mesmo tempo, mas apenas uma thread
          pode adquirir o lock de escrita, garantindo exclusividade


         */

    }
}
