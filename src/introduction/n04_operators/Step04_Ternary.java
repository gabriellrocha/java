package introduction.n04_operators;

@SuppressWarnings("all")
public class Step04_Ternary {

    public static void main(String[] args) {

        // Forma consisa de usar uma estrutura condicional
        // Possibilita atribuir valores diferentes a uma variável dependendo da condição
        // Consiste em três operandos

        // sintaxe:   condicional ? casoTrue : casoFalse

        int numberOne = 10;
        int numberTwo = 18;
        int numberThree = 17;

        int max = numberOne > numberTwo ? numberOne : numberTwo;

        // ternário aninhado - Pode ser consufo - Evite

        String result = numberThree == numberOne ? "Equal" :
                numberThree < numberOne ?  "Less" : "Greater";

        System.out.println(result); // Greater

    }
}
