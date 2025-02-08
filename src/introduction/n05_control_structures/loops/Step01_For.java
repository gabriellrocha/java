package introduction.n05_control_structures.loops;

public class Step01_For {

    public static void main(String[] args) {

        // Repetição controlada com contador
        // Ideal quando sabemos de antemão a quantidade de repetições


        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

//        Sintaxe

//        for (initialization; condition; modification)

//        initialization - executa apenas uma vez antes do inicio do loop
//        condition      - operação booleana
//        modification   - invocada após cada interação do loop (incremento/decremento)

    }
}