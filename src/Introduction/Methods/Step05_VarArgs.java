package Introduction.Methods;

import java.util.Arrays;

public class Step05_VarArgs {

    public static void main(String[] args) {

        // varargs (argumentos variáveis)
        // Permitem que um métoodo recebe um número variável de argumentos do mesmo tipo
        // O Java trata os argumentos passados como um array
        // Só pode haver um varargs por métoodo, e ele deve ser o último

        int result = addNumbers(3, 5, 6, 7, 8, 9, 0);
        int result2 = addNumbers(6, 8, 0, 10, 15, 68, 190);

        System.out.println(result);
        System.out.println(result2);


    }

    private static int addNumbers(Integer... numbers) {

        return Arrays.stream(numbers)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
