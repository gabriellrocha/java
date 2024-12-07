package introducao;

@SuppressWarnings("all") // ignorar todos os warning desta classe
public class Step11_Cast {
    public static void main(String[] args) {


        // Cast é uma operação que envolve atribuir o valor de uma variável a outro tipo de variável
        // Temos dois tipos de cast em Java: Implícito e Explicito

        // Implícito é executado automáticamente pelo compilador
            // Quando o tipo de destino é mais largo que o tipo de origem

        // Explícito deve ser feito manualmente pelo programador (pode envolver perda de informações)
            // Quando o tipo de destino é menor que o tipo de origem
            // Basta escrever o tipo de destino entre ()

        // E.g. Implícito

        int numberInt32bits = 10500;
        long numberLong64bits = numberInt32bits; // 10500L

        // E.g Explicito

        short numberShort16bits = 32000;
        byte numberByte8bits = (byte) numberShort16bits; // (truncado) Não faça isso! Apenas para fins de conhecimento.

        /* Truncado é quando o valor  de origem é muito grande para o valor de origem, fazendo com que
         ele transborde e volte para um valor menor (começa de 0 denovo) */


        // char para int - na verdade obtemos o valor ASCII para um determinado caractere

        char charA = 'A';
        int numberAsciiA = charA; // 65
        System.out.println(numberAsciiA);


    }
}
