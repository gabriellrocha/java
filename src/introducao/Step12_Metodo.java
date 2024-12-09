package introducao;

import java.math.BigDecimal;

public class Step12_Metodo {

    public static void main(String[] args) {

        // Métodoo - sequência de instruções que podem ser INVOCADAS ou REFERÊNCIADAS pelo seu nome

        int result = calculaVolume(3, 7, 2);
        System.out.println("O volume é " + result);


        BigDecimal bigDecimal = new BigDecimal(100);
        bigDecimal = bigDecimal.negate();                   // métoodo de instância - opera sobre os dados do objeto


    }


    // métoodo de classe
    private static int calculaVolume(int comprimento, int largura, int altura ) {

        return comprimento * largura * altura;
    }
}
