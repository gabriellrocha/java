package Introduction.DataTypes.Primitive;

public class Step01_Char {

    public static void main(String[] args) {

        // Usado para representar símbolos(letras, dígitos, símbolos especiais)

        // 2 bytes, valores de 0 a 65,535 (representa um único caractere unicode)

        char lowerCaseLetter = 'a';
        char upperCaseLetter = 'A';
        char number = 10;
        char space = ' ';
        char dollar = '$';


        // O tipo char guarda o número correspondente ao código Unicode

        char myChar = 'A'; // 65 (decimal) - 0x0041 (hexadecimal)

        System.out.println((int) myChar); // saída 65


        // Também pode ser criado usando o seu código hexadecimal da tabela Unicode

        char ch = '\u0040'; // isto representa @ - valor mínimo \u0000 valor máximo \uffff
        System.out.println(ch); // @



    }

}
