package Introduction.ControlStructures.Loops;

public class Step02_While {
    public static void main(String[] args) {

        // Repetição baseada em uma condição verdadeira - TRUE
        // loop pré-test (verifica a condição antes do bloco ser executado)
        // Ideal quando não sabemos de antemão a quantidade de repetições


        char letter = 'a';

        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
    }
}
