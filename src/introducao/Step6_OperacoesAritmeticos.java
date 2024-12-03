package introducao;

public class Step6_OperacoesAritmeticos {

    public static void main(String[] args) {

        // Operações aritmeticas são cálculos matemáticos que podem ser realizados usando operadores aritmeticos

        /*
            Operadores Aritméticos Binários
            Os operadores são chamados de "binários" pq recebem dois valores como operandos

            adição (+), subtração (-), multiplicacao(*), divisão (/), módulo ou resto (%)

        * */

        System.out.println(8 / 3); // = 2, pois ao dividir dois inteiros a parte fracionária é descartada

        System.out.println(10 % 2); // resto 0


        System.out.println(5 % 9);
        /*
            = 5, pois quando o dividendo é menor que o divisor, o quociente é 0 e o resto é igual ao dividendo
         */

        // Ordem de precedência segue as regras aritméticas padrão
        // Precedência se refere a ordem de execução e agrupamento de operações em uma expressão
        /*
            parênteses;
            unário mais/menos;
            multiplicação, divisão, resto;
            adição, subtração.
        * */


        // Operador Unário -> Recebe um único Operando como valor

        System.out.println(+5); // Operador Plus -> Indica um valor positivo (É opcional) Saída = 5

        System.out.println(-(100 + 10)); // Operador menos -> nega um valor ou uma expressão. saída = -110


    }

}
