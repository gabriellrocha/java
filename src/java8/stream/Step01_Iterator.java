package java8.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Step01_Iterator {

    public static void main(String[] args) {

        // A interface Iterator<T> permite percorrer elementos de uma coleção sequencialmente
        // Todas as coleções de Collection fornecem um Iterator via iterator()

        /* Principal utilidade é permitir percorrer coleções sem precisar de um ‘loop’ indexado (for tradicional),
            tornando a iteração mais genérica e segura, especialmente para coleções que não tem índice,
            como Set, Queue

            A própria coleção sabe como deve ser percorrida
            for-each usa Iterator implicitamente
        * */

        List<String> list = Arrays.asList("Gabriel", "João", "Maria", "Joaquim");

        Iterator<String> iterator = list.iterator();

//        Compilador traduz este código para um foreach. Linha 30
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());

        for (String s: list) {
            System.out.println(s);
        }
    }
}
