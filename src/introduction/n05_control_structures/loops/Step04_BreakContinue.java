package introduction.n05_control_structures.loops;

public class Step04_BreakContinue {

    public static void main(String[] args) {

        // break - interrompe a execução do loop

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 3) {
                System.out.println("...Break");
                break;
            }
        }


        // continue - pula para a próxima iteração

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
