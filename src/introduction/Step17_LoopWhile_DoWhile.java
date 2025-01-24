package introduction;

import java.util.Scanner;

public class Step17_LoopWhile_DoWhile {

    public static void main(String[] args) {

        // Úteis para repetir fragmentos de código enquanto uma condição é TRUE

        // While - ou ‘loop’ de pré-teste, pois verifica a condição antes do bloco de código ser executado

        // O corpo pode ter qualquer instrução java correta, desde instruções condicionais até outros loops

        int number = 1;
        while (number < 6) {
            System.out.println(number);
            number ++;
        }

        char letter = 'A';

        while (letter <= 'Z') {
            System.out.print(letter);  // print 'A' to 'Z'
            letter++;
        }


        // Do While - pós-teste

        // O corpo é executado primeiro e a condição é verificada depois

        Scanner keyboard = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("\nEnter 0 to exit");
            inputNumber = keyboard.nextInt();       // executa o bloco pelo menos uma vez

        } while (inputNumber != 0);

        System.out.println("Bye!");

    }
}
