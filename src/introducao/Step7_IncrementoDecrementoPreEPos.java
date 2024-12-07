package introducao;

public class Step7_IncrementoDecrementoPreEPos {

    public static void main(String[] args) {

        // Incremento é usado para aumentar uma variável em uma unidade
        // Decremento é usado para diminuir uma variável em uma unidade

        int numero = 10;

        numero ++; // 11
        numero ++; // 12
        numero --; // 11

        // Formas prefixadas e pós-fixadas

        // A forma prefixada ++n (ou --n) aumenta ou diminui o valor de uma variável antes de ser usada

        // A forma pós-fixa n++ (ou n--) aumenta ou diminui o valor de uma variável depois que ela é usada

        // O operador pós-fixa tem precedência maior que atribuição =

        int a = 5;
        int b = a++; // primeiro atribui o valor de a em b e depois incrementa 1 em a

        System.out.println(a); // 6
        System.out.println(b); // 5



    }
}
