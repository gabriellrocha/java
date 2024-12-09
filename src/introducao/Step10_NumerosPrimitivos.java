package introducao;

public class Step10_NumerosPrimitivos {

    public static void main(String[] args) {

        // Valores primitivos são tipos de dados integrados e fornecidos pela linguagem
        // Tipos do mesmo grupo operam de forma semelhante, mas tem tamanhos diferentes

        // Números inteiros

        // byte, short, int, long
        // O intervalo de um tipo é cálculado como (2^n - 1) Onde 'n' é o número de bits

        // byte 1 byte | -128 à 127 | 2^8 = 256 (0 à 255), porém é um número signed (com sinal), ou seja, existe um bit reservado para o mesmo

        // short 2 bytes | -32768 à 32767 | 2^16 (0 à 65536) - Já deu para entender a idéia


        // Números ponto flutuante

        // float (32bits), double (64 bits)
        // Podem armazenar apenas um número limitado de dígitos decimais significativos

        /* float e double não podem representar um número arbitrário, pois suportam um número limitado de
        dígitos decimais significativos*/

        // Números arbitrários - permite cálculos com precisão exata

        float numberFloat = 0.888888888888888888f;
        System.out.println(numberFloat); // it print only 0.8888889

        // tipos de ponto flutuante tem uma maneira específica de marcar valor com uma mantissa

        double eps = 5e-3; // 5 * 10 ^ (-3)

        // Atenção:
        int resultOne = 5 / 4; // divisão inteira produz resultado inteiro = 1
        double resultTwo = 5.0 / 4; // divisão real produz resultado de ponto flutuante = 1.25

        System.out.println(resultOne);
        System.out.println(resultTwo);
    }
}
