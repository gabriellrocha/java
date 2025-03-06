package DataStructure.Arrays.Array;

import java.util.Arrays;
import java.util.List;

public class Step02_ArraysUtil {

    /* A classe Arrays fornece diversos métodos para manipular arrays de maneira eficiente
    */

    public static void main(String[] args) {

        int[] numbers = {9, 8, 7};
        int[] numbers2 = {9, 8, 7};

        // Alguns métodos....

        Arrays.sort(numbers);       // ordena

        Arrays.fill(numbers, 100); // preenche todos os elementos com um valor específico

        int[] newArray = Arrays.copyOf(numbers, 5); // cria uma cópia do array com um novo tamanho

        Arrays.equals(numbers, numbers2); // verifica se são iguais (mesmo tamanho e mesmo conteúdo)

        List<Integer> list = Arrays.asList(10, 20, 30); // converte um array em uma lista

        Arrays.stream(newArray); // obtém um Stream a partir do array específicado
    }
}
