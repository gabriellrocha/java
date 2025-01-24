package introduction;

import java.util.Scanner;

public class Step5_Scanner {

    public static void main(String[] args) {

        /* Entrada padrão é um fluxo de dados que entra em um programa e é suportado pelo SO
           Por padrão é o teclado, mas pode ser redirecionada de um arquivo
         */

        // System.in representa a entrada padrão
        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // ler uma única palavra, e já remove o delimitador espaço " " do buffer
        String lastName = sc.next();
        System.out.println("Olá " + name + " " + lastName);



        // Scanner ler os dados do buffer, não diretamente do teclado
        // next () e seus variantes, nextInt, nextDouble etc, consomem um token e ignoram o restante da linha
        // token é uma sequencia de caracteres delimitda por um espaço em branco ou quebra de linha \n
        // nextline() consome tudo até o fim da linha \n, incluindo tokens e espaços
        // o buffer é uma área reservada na memória RAM, que é gerenciada pelo sistema operacional

        sc.close();
    }
}
