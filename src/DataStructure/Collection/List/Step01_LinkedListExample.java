package DataStructure.Collection.List;

import java.util.Arrays;
import java.util.LinkedList;

public class Step01_LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = getList();

        // Além de List, implementa Deque
        // Deque - Permite inserção/remoção em ambas as extremidades

        // Métodos exclusivos de LinkedList (ajustam o ponteiro da lista encadeada)

        numbers.addFirst(76); // cria um novo nó e ajusta o ponteiro HEAD
        numbers.removeFirst(); // move o ponteiro HEAD p/ o próximo nó e descarta o antigo primeiro nó


        numbers.addLast(90); // cria um novo nó e ajusta o ponteiro TAIL
        numbers.removeLast();  //  move o ponteiro tail para o nó anterior e descarta o antigo último nó.


        Integer i = numbers.get(3); // Como funciona:
        // Se o índice estiver mais próximo do inicio, ele começa do HEAD do contrário começa do TAIL


    }

    private static LinkedList<Integer> getList() {

        return new LinkedList<>(Arrays.asList(
                1, 2, 6, 7, 9, 0, 10, 50, 87, 54, 12, 98
        ));
    }
}
