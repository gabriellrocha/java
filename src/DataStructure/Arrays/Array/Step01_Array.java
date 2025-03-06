package DataStructure.Arrays.Array;

import java.util.Arrays;

public class Step01_Array {

    /* Array - Armazena valores do mesmo tipo em uma estrutura contígua na memória
       Contígua = posições consecutivas

       - Cada elemento no array tem um índice
       - Uma vez criado não pode ser redimensionado

    */

    public static void main(String[] args) {

        // Maneiras de instanciar um array

        int[] arrayOfInt = new int[10];             // com 10 posições, inicilizado com zeros
        int[] arrayOfInt2 = {6, 7, 8, 9};           // cria e inicializa diretamente
        int[] arrayOfInt3 = new int[]{1, 2, 3};     // forma alternativa - pouco usual


        // Iterando Java 7
        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println(arrayOfInt[i]);
        }


        // Iterando Java 8+
        Arrays.stream(arrayOfInt).forEach(System.out::println);

    }
}
