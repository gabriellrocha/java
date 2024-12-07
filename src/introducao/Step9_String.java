package introducao;

public class Step9_String {

    public static void main(String[] args) {

        // String é usado para representar palavras
        // É imutável - Operações com Strings geram novas Strings

        String nome2 = new String("Gabriel"); // fica armazenado no heap

        String nome = "Gabriel"; // fica armazenado no pool de Strings

        // Pool de string é uma área especial na memória onde strings imutáveis são armazenadas
        // String literal aumenta o desempenho e economiza memória

        int lenght = nome.length(); // 7
        int firstChar = nome.charAt(0); // G
        int lastChar = nome.charAt(nome.length() -1); // l

        String str1 = "Hello ";
        String str2 = " World";

        // Nota: Em operações com String a ordem é importante, E.g

        // str1 + str2 é diferente de str2 + str1, porque concatenação em String não é uma operação comutativa

        // Nota: Strings devem ser comparadas usando equals()




    }
}
