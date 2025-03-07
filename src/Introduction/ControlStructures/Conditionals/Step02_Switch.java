package Introduction.ControlStructures.Conditionals;

public class Step02_Switch {

    public static void main(String[] args) {

        // Tomada de decisão
        // Escolha múltipla baseada em um valor específicado. Aceita os seguintes tipos:
        // primitivos e seus wrappers(byte, short, char, int), Enum, String

        Fruit fruit = Fruit.values()[0];

        // switch tradicional

        switch (fruit) {
            case BANANA:
                System.out.println("Banana");
                break;
            case PAPAYA:
                System.out.println("Papaya");
                break;
            default:                           // optional
                System.out.println(":(");
        }
    }


    private enum Fruit {
        BANANA, ORANGE, LEMON, PAPAYA
    }

}
