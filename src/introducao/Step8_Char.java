package introducao;

public class Step8_Char {

    public static void main(String[] args) {

        // char é usado para representar símbolos, sejam eles letras, dígitos, e símbolos especiais
        // consome 16 bits (2 bytes)
        // corresponde ao formato Unicode (UTF-16) - Java usa UTF-16 para representar caracteres
        // UTF-16 é um superconjunto de ASCII
        // ASCII (Representação inteira do alfabeto inglês)

        char lowerCaseLetter = 'a';
        char upperCaseLetter = 'A';
        char number = 10;
        char space = ' ';
        char dollar = '$';

        // O tipo char guarda o número correspondente ao código Unicode. E.g.

        char myChar = 'A'; // 65 (decimal) - 0x0041 (hexadecimal)

        System.out.println((int) myChar); // saída 65


        // Também pode ser criado usando o seu código hexadecimal da tabela Unicode

        char ch = '\u0040'; // isto representa @ - valor mínimo \u0000 valor máximo \uffff
        System.out.println(ch); // @


        // Unicode é uma tabela que atribui um número exclusivo a cada caractere
        // HexaDecimal é um sistema numérico que representa números usando a base 16
        // Cada dígito no sistema hexadecimal corresponde a 4 bits (nibble) no sistema binário

        // Qualquer char variável pode ser considerada como um valor inteiro sem sinal no intervalo de 0 a 65535



    }

}
