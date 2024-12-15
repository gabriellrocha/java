package introducao;

public class Step19_BreakContinue {

    public static void main(String[] args) {

        // Úteis para alterar o comportamento padrão de um loop
        // Também conhecidos como branching statements


        // Break - Encerra um loop imediatamente
        // break também encerra um case na instrução Switch
        /* A instrução break encerra apenas o loop onde está localizada, se este loop for aninhado
            o loop externo não será interrompido*/

        int number = 10;
        while (true) {
            if (number == 0) {
                break;
            }
            number --;
        }


        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j){
                    break;
                }
            }
            System.out.println();
        }



        // Continue - Pula a iteração atual e vai para a próxima
        // Usos:

        // dentro do for loop a controle se move imediatamente para instrução de incremento/decremento

        int n = 10;

        for (int i = 0; i < n; i++){

            if (i % 2 != 0){
                continue;  // pula para o incremento
            }
            System.out.println(i);
        }


    }
}
