package introduction.n05_control_structures.conditionals;

import java.util.Scanner;

public class Step01_IfElse {

    public static void main(String[] args) {

        // Tomada de decisão
        // Executa blocos de código com base em condições

        int number = getOption();

        if(number == 1) {
            System.out.println("One");

        } else if (number == 2) {
            System.out.println("Two");

        } else {
            System.out.println("Default");
        }
    }

    private static int getOption() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
