package java8.stream;

import java.util.*;

public class Step01_Iterator {

    /* Interface Iterator<T> permite percorrer os elementos de uma coleção de forma sequencial,
       sem a necessidade de loop indexado.

       É útil principalmente p/ coleções sem índice, como Set e Queue

       O métoodo iterator() de cada coleção fornece um Iterator, e o for-each usa o implicitamente
    */

    public static void main(String[] args) {

        List<String> list = List.of("Gabriel", "João", "Maria", "Joaquim");
        Set<Integer> set = new HashSet<>(List.of(4, 3, 7, 2, 9, 8));
        Queue<String> queue = new LinkedList<>(List.of("A", "B", "C", "D"));

        Iterator<String> iteratorList = list.iterator();
        Iterator<Integer> iteratorSet = set.iterator();
        Iterator<String> iteratorQueue = queue.iterator();

//        Compilador traduz este código para um for-each
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());

        for (String s: list) {
            System.out.println(s);
        }
    }
}
