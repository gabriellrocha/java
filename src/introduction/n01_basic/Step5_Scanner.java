package introduction.n01_basic;

import java.util.Scanner;

public class Step5_Scanner {

    public static void main(String[] args) {

        // Scanner - Usada para ler entrada dados de diversas fontes, como teclado, arquivos e String

        // Divide a entrada em Tokens com base em delimitadores (por padrão, espaços e quebra de linha)
        // Token é uma sequência de caracteres delimitada por um delimitador

        // System.in representa a entrada padrão
        Scanner sc = new Scanner(System.in);


        String name = sc.next(); // ler uma única palavra, e já remove o delimitador espaço " " do buffer
        String lastName = sc.next();
        System.out.println("Olá " + name + " " + lastName);
        sc.close();  // libera recursos

        // Mais características
        // Ler os dados do buffer, não diretamente do teclado

        /* Buffer:
           É uma área da memória temporária usada para armazenar dados antes de serem
           processados, ele 'acelera a leitura' reduzindo acesso direto ao dispositivo de entrada(ex: teclado, arquivos)
          */

    }
}
