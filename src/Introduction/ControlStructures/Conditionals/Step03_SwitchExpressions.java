package Introduction.ControlStructures.Conditionals;

public class Step03_SwitchExpressions {

    public static void main(String[] args) {

        // Java 12+
        // Pode retornar valores, tornando o switch uma expressão
        // Não requer break (elimina erros fall-through)

        Fruit fruit = Fruit.values()[0];


        String result = switch (fruit) {
            case BANANA -> "Banana";
            case PAPAYA -> "Papaya";
            default ->  ":(";
        };
    }


    private enum Fruit {
        BANANA, ORANGE, LEMON, PAPAYA
    }

}
