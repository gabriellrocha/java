package Advanced.Multithreading.Concurrent.Collections;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Step01_CopyOnWriteArrayList {

    /*  List Thread-Safe

        - Cria uma cópia da lista a cada modificação (eficiente p/ leituras)

     */

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(3, 6, 9));
        list.forEach(System.out::println);
    }
}
