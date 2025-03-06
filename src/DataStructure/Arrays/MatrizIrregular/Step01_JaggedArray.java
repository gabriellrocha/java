package DataStructure.Arrays.MatrizIrregular;

import java.util.Arrays;

public class Step01_JaggedArray {

    /* Matriz irregular(jagged array) é um array de arrays onde cada sub-array pode ter tamanhos diferentes
     */

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2},             // linha 0, 2 colunas
                {3, 4, 5},          // linha 1, 3 colunas
                {6}                 // linha 2, 1 coluna
        };


        Arrays.stream(matriz)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    }
}
