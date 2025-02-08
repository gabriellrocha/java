package introduction.n01_basic;

public class Step4_Variables {

    public static void main(String[] args) {

        // Variáveis
        // Espaço reservado para na memória para armazenar um valor de um tipo específico
        // Java é fortemente típado

        // Sintaxe
        // DataType variableName = initialization;

        // DateType = determina quais as operações podem ser executadas na variável e quais valores podem ser armazenados
        // variableName = distingue a variável das outras
        // ( = ) operador de atribuição
        // initialization = valor literal, resultado de uma expressão, new

        String language = "Java";

        // Cópia do valor para a outra variável
        int one = 1;
        int num = one;

       // Formas alternativas de declaração

       // Variáveis do mesmo tipo em um única instrução
       String lang = "Java", version = "17";

       // Separando declaração de inicialização

        int age; // declaration
        age = 25; // initialization

        // Inferência de tipo. Desde o Java 10 (pode escrever 'var' ao invés de um tipo específico)

        var meuNome = "Gabriel"; // Porém...
        // É obrigatória a inicialização
        // Código menos legível (valor de retorno fica implícito



    }
}
