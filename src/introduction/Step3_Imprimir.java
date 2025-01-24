package introduction;

public class Step3_Imprimir {

    public static void main(String[] args) {

        // Saída padrão é um receptor para o qual o programa pode enviar informações como texto, é suportado por todos os SO comuns
        System.out.print("Imprimir na saída padrão");

        // Caractere de escape, representa um símbolo especial que não tem símbolo correspondente no teclado

        System.out.print("\nRepresento uma quebra de linha\n");

        // Concatenar String ou outros literais
        // Coloque os adjacentes uns aos outros e use o operador + para juntá-los.

        String nome = "Gabriel";
        System.out.println("Meu nome é " + nome);

        int idade = 25;
        // Nesta caso o valor "idade" será convertido em String e convertido ao valor à esquerda
        System.out.println("Tenho " + 25 + " anos");

    }


}
