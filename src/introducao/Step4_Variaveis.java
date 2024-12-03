package introducao;

public class Step4_Variaveis {

    public static void main(String[] args) {

        // Variáveis são um espaço reservado para armazenar um valor de um tipo específico(String, numero ou outra coisa)

        // Sintaxe
        // DataType variableName = initialization;

        // DateType = determina quais as operações podem ser executadas na variavel e quais valores podem ser armazenados
        // variableName = distingue a variável das outras
        // ( = ) operador de atribuição
        // initialization = valor ou resultado de uma expressão que é atribuido a variavel

        String language = "Java";

        // Realiza a cópia do valor para a outra variável
        int one = 1;
        int num = one;

       // Formas alternativas de declaração

       // Declarando diversas variáveis do mesmo tipo em um única instrução
       String lang = "Java", version = "17";

       // Separando declaração de inicialização

        int age; // declaration
        age = 25; // initialization

        // Inferência de tipo. Desde o Java 10 (pode escrever 'var' ao invés de um tipo específico)

        var meuNome = "Gabriel"; // Porém, é obrigatória a inicialização (cuidado! pode tornar o código menos legível)



    }
}
