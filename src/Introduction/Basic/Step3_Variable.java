package Introduction.Basic;

public class Step3_Variable {

    /* Pedaço de memória que pode conter um valor de dados

        Sintaxe:

        tipo nome = inicialização;
        tipo = determina quais operações podem ser executadas na variável e quais valores podem ser armazenados
        (=) operador de atribuição
        inicialização = valor literal, resultado de uma expressão, new

    */

    public static void main(String[] args) {

        String language = "Java";

        // Cópia do valor para a outra variável
        int one = 1;
        int num = one;

        // Formas alternativas de declaração

        // Variáveis do mesmo tipo em um única instrução
        String lang = "Java", version = "17";

        // Inferência de tipo. Desde o Java 10 (pode escrever 'var' ao invés de um tipo específico)

        var meuNome = "Gabriel"; // Porém...
        // É obrigatória a inicialização
        // Código menos legível (valor de retorno fica implícito

    }
}
