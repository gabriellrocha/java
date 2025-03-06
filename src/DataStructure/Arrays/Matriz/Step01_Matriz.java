package DataStructure.Arrays.Matriz;

import java.util.Arrays;

public class Step01_Matriz {

    /* Matriz - É um array multidimensional, ou seja um array de arrays

        Um array bidimensional(int[][] matriz) pode ser visto como uma tabela com linhas e colunas
        Cada elemento é acessado com dois índices: matriz[linha][coluna]
    */

    public static void main(String[] args) {

        // Maneiras de instanciar uma matriz

        int[][] matriz = {              // um array de tamanho 2, onde cada posição armazena um array de tamanho 3
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matriz2 = new int[2][4];  // um array de tamanho 2, onde cada posição armazena um array de tamanho 4


        // Iterando Java 7
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        // Java 8+
        Arrays.stream(matriz)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);

    }
}
