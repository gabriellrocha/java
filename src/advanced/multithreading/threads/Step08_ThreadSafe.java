package advanced.multithreading.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Step08_ThreadSafe {

/* Classe Thread-Safe: É uma classe projetada p/ ser usada por várias threads simultaneamente
    sem causar problemas como condições de corrida(race condition) ou corrupção dos dados

    - Uma classe pode ser thread-safe de várias maneiras, como:
        - Sincronização explícita(por exemplo, usando synchronized ou ReentrantLock)
        - Imutabilidade (eliminando a necessidade de sincronização)
        - Estruturas de dados thread-safe (package concurrent)
*/

    public static void main(String[] args) {

        ListManager listManager = new ListManager();

        listManager.getElements().add("Gabriel");

        // Apenas a thread que obter o lock primeiro irá remover o elemento
        Thread thread1 = new Thread(listManager::removeFirst);
        Thread thread2 = new Thread(listManager::removeFirst);
        thread1.start();
        thread2.start();

    }
}

@SuppressWarnings("all")
class ListManager {

    // lista sincronizada
    private final List<String> elements = Collections.synchronizedList(new ArrayList<>());

    // a camada acima que acessa a coleção ainda precisa ser sincronizada
    public synchronized void removeFirst() {

        System.out.println(Thread.currentThread().getName() + ": has to Look");

        if (elements.size() > 0) {
            String element = elements.remove(0);
            System.out.println(Thread.currentThread().getName() + ": removed " + element);
        }

        System.out.println(Thread.currentThread().getName() + ": look available");
    }

    public List<String> getElements() {
        return elements;
    }
}