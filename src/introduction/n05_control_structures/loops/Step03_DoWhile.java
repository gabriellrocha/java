package introduction.n05_control_structures.loops;

import java.util.Scanner;

public class Step03_DoWhile {

    public static void main(String[] args) {

        // Semelhante ao While, mas garante ao menos uma execução
        // pós-teste


        Scanner keyBoard = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter 0 to exit ");
            number = keyBoard.nextInt();


        } while (number != 0);
    }
}
